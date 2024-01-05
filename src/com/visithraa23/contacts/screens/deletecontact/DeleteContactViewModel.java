package com.visithraa23.contacts.screens.deletecontact;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.visithraa23.contacts.repository.ContactRepository;

public class DeleteContactViewModel {
	private DeleteContactView deleteContactView;
	private ContactRepository repository;

	public DeleteContactViewModel(DeleteContactView view) {
		deleteContactView = view;
		repository = ContactRepository.getInstance();
	}

	public void deleteContact(String contact) throws SQLException {
		ResultSet result = repository.findContact(contact);
		if (result.next()) {
			repository.deleteContact(contact);
			deleteContactView.printOut("Deleted Successfully..");
		} else {
			deleteContactView.printOut("No Contact Found");
		}
	}

}
