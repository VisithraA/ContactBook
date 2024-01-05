package com.visithraa23.contacts.screens.addcontact;

import java.util.Scanner;

public class AddContactView {
	private AddContactViewModel addContactViewModel;
	
	public AddContactView() {
		addContactViewModel=new AddContactViewModel(this);
	}
	public void addContact() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name=sc.nextLine();
		System.out.print("Enter Phone Number : ");
		String phoneNumber=sc.nextLine();
		addContactViewModel.addContact(name,phoneNumber);
		
	}

}
