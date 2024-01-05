package com.visithraa23.contacts.dto;

public class ContactList {

	private int contactId;
	private String contactName;
	private String contactNumber;

	public ContactList(String name, String phoneNumber) {
		contactName = name;
		contactNumber = phoneNumber;
	}

	public ContactList() {
		// TODO Auto-generated constructor stub
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
    public String toString() {
        return String.format("| %-10d | %-28s | %-30s |", contactId, contactName, contactNumber);
    }

}
