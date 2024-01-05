package com.visithraa23.contacts.screens.showcontacts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.visithraa23.contacts.dto.ContactList;

public class ShowContactsView {
	private ShowContactsViewModel showContactsViewModel;

	public ShowContactsView() {
		showContactsViewModel=new ShowContactsViewModel(this);
	}

	public void showContacts() throws SQLException {
		ResultSet result=showContactsViewModel.showContacts();
		System.out.println("\n------------------------------------------------------------------------------");
		System.out.println("| Contact ID |         Contact Name         |         Contact Number         |");
		System.out.println("------------------------------------------------------------------------------");

		if (!result.next()) {
		    System.out.println("|    No results found.                                                |");
		} else {
		    do {
		        ContactList contact = new ContactList();
		        contact.setContactId(result.getInt("contactId"));
		        contact.setContactName(result.getString("contactName"));
		        contact.setContactNumber(result.getString("contactNumber"));
		        System.out.println(contact);
		    } while (result.next());
		}
		System.out.println("------------------------------------------------------------------------------");

	}

	

}
