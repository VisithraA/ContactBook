package com.visithraa23.contacts.screens.addcontact;

import java.sql.SQLException;

import com.visithraa23.contacts.dto.ContactList;
import com.visithraa23.contacts.repository.ContactRepository;

public class AddContactViewModel {

	private AddContactView addContactView;
	private ContactRepository repository;

	public AddContactViewModel(AddContactView view) {
		addContactView = view;
		repository = ContactRepository.getInstance();
	}

	public void addContact(String name, String phoneNumber) throws SQLException {
		ContactList contact=new ContactList(name,phoneNumber);
		repository.addContact(contact);
		
		addContactView.printOutput("Contact Added Successfully..");
	}

}
