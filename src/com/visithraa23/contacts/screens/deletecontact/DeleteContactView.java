package com.visithraa23.contacts.screens.deletecontact;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteContactView {
	public DeleteContactViewModel deleteContactViewModel;

	public DeleteContactView() {
		deleteContactViewModel = new DeleteContactViewModel(this);
	}

	public void deleteContact() throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the contact..");
		String contact=sc.nextLine();
		deleteContactViewModel.deleteContact(contact);
	}

	public void printOut(String output) {
		System.out.println(output);
	}

}
