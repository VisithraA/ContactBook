package com.visithraa23.contacts.main;

import java.util.Scanner;

import com.visithraa23.contacts.screens.addcontact.AddContactView;

public class MainView {

	public static void start() {
		Scanner sc=new Scanner(System.in);
		Boolean condition=true;	
		do {
			System.out.println("--------------Contacts----------------");
			System.out.println("\t1.Add Contact \n\t2.Search Contact \n\t3.Edit Contact \n\t4.Delete Contact \n.Exit");
			int input=sc.nextInt();
			
			switch (input) {
			case 1:{
				AddContactView addContactView=new AddContactView();
				addContactView.addContact();
				break;
			}
			case 2:{

				break;
			}	
			case 3:{

				break;
			}
			case 4:{

				break;
			}
			case 5:{
				condition=false;
				break;
			}
			default:
				System.out.println("Enter Valid Input");
				break;
			}
		} while (condition);
		
	}

}
