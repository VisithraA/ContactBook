package com.visithraa23.contacts.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.visithraa23.contacts.dto.ContactList;

public class ContactRepository {
	private static ContactRepository repository;
	public static Connection connection;

	private ContactRepository() {
		String url = "jdbc:mysql://localhost:3306/contactbook";
		String userName = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static ContactRepository getInstance() {
		if (repository == null)
			repository = new ContactRepository();
		return repository;
	}

	public void addContact(ContactList contact) throws SQLException {
		PreparedStatement preparedStatement = connection
				.prepareStatement("Insert into contacts(contactName,contactNumber) values(?,?)");
		preparedStatement.setString(1, contact.getContactName());
		preparedStatement.setString(2, contact.getContactNumber());
		preparedStatement.execute();
	}

	public ResultSet searchContact(String searchInput) throws SQLException {
		PreparedStatement preparedStatement = connection
				.prepareStatement("select * from contacts where LOWER(contactName) like '%" + searchInput.toLowerCase()
						+ "%' OR contactNumber like '%" + searchInput.toLowerCase() + "%' ");

		return preparedStatement.executeQuery();

	}

	public ResultSet findContact(String contact) throws SQLException {
		PreparedStatement preparedStatement=connection.prepareStatement("select * from contacts where contactName='contact' or contactNumber='contact'");
		return preparedStatement.executeQuery();
		
	}

	public void deleteContact(String contact) throws SQLException {
		PreparedStatement preparedStatement = connection
				.prepareStatement("delete from contacts where contactName='contact' or contactNumber='contact'");
		preparedStatement.executeUpdate();
	}

	public ResultSet showContacts() throws SQLException {
		PreparedStatement preparedStatement=connection.prepareStatement("select * from contacts");
		return preparedStatement.executeQuery();
	}

}
