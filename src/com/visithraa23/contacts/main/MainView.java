package com.visithraa23.contacts.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.visithraa23.contacts.screens.addcontact.AddContactView;
import com.visithraa23.contacts.screens.deletecontact.DeleteContactView;
import com.visithraa23.contacts.screens.editContact.EditContactView;
import com.visithraa23.contacts.screens.searchcontact.SearchContactView;
import com.visithraa23.contacts.screens.showcontacts.ShowContactsView;

public class MainView {

	public static void start() throws SQLException {
		Scanner sc=new Scanner(System.in);
		Boolean condition=true;	
		do {
			System.out.println("\n*************Contacts****************");
			System.out.println("\t1.Add Contact \n\t2.Search Contact \n\t3.Edit Contact \n\t4.Delete Contact \n\t5.Show Contacts \n\t0.Exit");
			System.out.println("**************************************");
			int input=sc.nextInt();
			
			switch (input) {
			case 1:{
				AddContactView addContactView=new AddContactView();
				addContactView.addContact();
				break;
			}
			case 2:{
				SearchContactView searchContactView=new SearchContactView();
				searchContactView.searchContact();
				break;
			}	
			case 3:{
				EditContactView editContactView=new EditContactView();
				editContactView.editContact();
				break;
			}
			case 4:{
				DeleteContactView deleteContactView=new DeleteContactView();
				deleteContactView.deleteContact();
				break;
			}
			case 5:{
				ShowContactsView showContactsView=new ShowContactsView();
				showContactsView.showContacts();
				break;
			}
			case 0:{
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
