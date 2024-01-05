package com.visithraa23.contacts.repository;

public class ContactRepository {
	private static ContactRepository repository;
	
	public static ContactRepository getInstance() {
		if(repository==null)
			repository=new ContactRepository();
		return repository;
	}
	
	
	public void addContact(String name, String phoneNumber) {
		
		
	}
}
