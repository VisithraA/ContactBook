package com.visithraa23.contacts.screens.editContact;

import com.visithraa23.contacts.repository.ContactRepository;

public class EditContactViewModel {

	private EditContactView editContactView;
	private ContactRepository contactRepository;
	
	public EditContactViewModel(EditContactView view) {
		editContactView=view;
		contactRepository=ContactRepository.getInstance();
	}

	public void ediContact(int selectId, int changeId, String newContactName) {
		
	}

	
}
