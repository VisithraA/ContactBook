package com.visithraa23.contacts.screens.addcontact;

import java.sql.SQLException;
import java.util.Scanner;

public class AddContactView {
	private AddContactViewModel addContactViewModel;
	
	public AddContactView() {
		addContactViewModel=new AddContactViewModel(this);
	}
	public void addContact() throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name=sc.nextLine();
		System.out.print("Enter Phone Number : ");
		String phoneNumber=sc.nextLine();
		addContactViewModel.addContact(name,phoneNumber);
		
	}
	public void printOutput(String output) {
		System.out.println(output);
	}

}
