package com.visithraa23.contacts.screens.editContact;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.visithraa23.contacts.dto.ContactList;
import com.visithraa23.contacts.repository.ContactRepository;

public class EditContactViewModel {

	private EditContactView editContactView;
	private ContactRepository contactRepository;
	
	public EditContactViewModel(EditContactView view) {
		editContactView=view;
		contactRepository=ContactRepository.getInstance();
	}

	public void ediContact(int selectId, int changeId, String contactUpdate) throws SQLException {
		ResultSet find=contactRepository.findId(selectId);
		if(find.next()) {
			if(changeId==1) {
				ContactRepository.editContactName(selectId,contactUpdate);
			}
			else {
				ContactRepository.editContactNumber(selectId,contactUpdate);
			}
			editContactView.printOutput("Contact Edited Succesfully..");
		}
		else {
			editContactView.printOutput("Id not Found...");
		}
	}

	
}
