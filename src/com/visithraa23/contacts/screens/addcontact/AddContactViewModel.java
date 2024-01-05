package com.visithraa23.contacts.screens.addcontact;

import com.visithraa23.contacts.repository.ContactRepository;

public class AddContactViewModel {

	private AddContactView addContactView;
	private ContactRepository repository;

	public AddContactViewModel(AddContactView view) {
		addContactView = view;
		repository = ContactRepository.getInstance();
	}

	public void addContact(String name, String phoneNumber) {
		repository.addContact(name, phoneNumber);
	}

}
