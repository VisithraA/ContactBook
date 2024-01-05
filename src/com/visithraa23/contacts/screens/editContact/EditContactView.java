package com.visithraa23.contacts.screens.editContact;

import java.sql.SQLException;
import java.util.Scanner;

import com.visithraa23.contacts.screens.showcontacts.ShowContactsView;

public class EditContactView {

	private EditContactViewModel editContactViewModel;

	public EditContactView() {
		editContactViewModel = new EditContactViewModel(this);
	}

	public void editContact() throws SQLException {
		Scanner sc = new Scanner(System.in);
		ShowContactsView showContactsView = new ShowContactsView();
		showContactsView.showContacts();
		System.out.print("\nSelect the contact for edit contact : ");
		int selectId = sc.nextInt();
		System.out.println("1.Change contact name \n2.change contact number");
		int changeId = sc.nextInt();
		sc.nextLine();
		switch (changeId) {
		case 1: {
			System.out.print("Enter the contact name : ");
			String newContactName = sc.nextLine();
			editContactViewModel.ediContact(selectId, changeId, newContactName);
			break;
		}
		case 2: {
			System.out.print("Enter the contact Number : ");
			String newContactNumber = sc.nextLine();
			editContactViewModel.ediContact(selectId, changeId, newContactNumber);
			break;
		}
		case 0: {
			break;
		}
		default: {
			System.out.println("Enter Valid Input..");
			break;
		}
		}
	}

}
