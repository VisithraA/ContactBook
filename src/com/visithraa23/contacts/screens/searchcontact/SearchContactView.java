package com.visithraa23.contacts.screens.searchcontact;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.visithraa23.contacts.dto.ContactList;

public class SearchContactView {

	private SearchContactViewModel searchContactViewModel;

	public SearchContactView() {
		searchContactViewModel = new SearchContactViewModel(this);
	}

	public void searchContact() throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Search...");
		String searchInput=sc.nextLine();
		ResultSet result= searchContactViewModel.search(searchInput);
		
		System.out.println("\n--------------------------------------------------------------");
		System.out.println("|         ContactName       |         Contact Number         |");
		System.out.println("--------------------------------------------------------------");
		if (!result.next()) {
		    System.out.println("|             No results found.                              |");
		} else {		
		    do {
		        ContactList contact = new ContactList();
		        contact.setContactName(result.getString("contactName")); // Adjust this based on your actual column names
		        contact.setContactNumber(result.getString("contactNumber"));
		        System.out.println(contact);
		    } while (result.next());
		}
		System.out.println("--------------------------------------------------------------");

	}

}
