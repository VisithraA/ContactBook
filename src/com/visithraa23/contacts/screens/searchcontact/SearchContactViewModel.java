package com.visithraa23.contacts.screens.searchcontact;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.visithraa23.contacts.dto.ContactList;
import com.visithraa23.contacts.repository.ContactRepository;

public class SearchContactViewModel {

	private SearchContactView searchContactView;
	private ContactRepository contactRepository;

	public SearchContactViewModel(SearchContactView view) {
		searchContactView = view;
		contactRepository = ContactRepository.getInstance();
	}

	public ResultSet search(String searchInput) throws SQLException {
		return contactRepository.searchContact(searchInput);
		
		
	}

}
