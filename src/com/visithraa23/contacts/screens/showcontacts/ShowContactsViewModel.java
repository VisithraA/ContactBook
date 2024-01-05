package com.visithraa23.contacts.screens.showcontacts;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.visithraa23.contacts.repository.ContactRepository;

public class ShowContactsViewModel {

	private ShowContactsView showContactsView;
	private ContactRepository repository;
	
	public ShowContactsViewModel(ShowContactsView view) {
		showContactsView=view;
		repository=ContactRepository.getInstance();
	}

	public ResultSet showContacts() throws SQLException {
		return repository.showContacts();
	}

	
}
