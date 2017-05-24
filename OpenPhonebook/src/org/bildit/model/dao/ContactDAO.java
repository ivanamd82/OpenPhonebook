package org.bildit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.bildit.model.dto.Contact;



public class ContactDAO implements IContactDAO {
	
	Connection connection = ConnectionManager.getInstance().getConnection();

	@Override
	public ArrayList<Contact> getContacts(String userName) throws SQLException {
		
		ArrayList<Contact> contacts = new ArrayList<>();
		
		String query = "SELECT * FROM imenik.contact WHERE contact.userName = ?";
				
		ResultSet rs = null;
		
		try (PreparedStatement ps = connection.prepareStatement(query)){
			
			ps.setString(1, userName);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				contacts.add(new Contact(rs.getInt("contactID"),rs.getString("name"),rs.getString("lastName"),rs.getString("phone"),rs.getString("email"),rs.getString("city"),rs.getString("userName")));
			}
			rs.close();
		} 
		return contacts;
	}
	
	public Contact getContact(int contactID) throws SQLException {
		
		Contact contact = null;
		
		String query = "SELECT * FROM imenik.contact WHERE contact.contactID = ?";
		
		ResultSet rs = null;
		
		try (PreparedStatement ps = connection.prepareStatement(query)) {
			
			ps.setInt(1, contactID);						
			rs = ps.executeQuery();
			
			if(rs.next()) {
				contact = new Contact(rs.getInt("contactID"),rs.getString("name"),rs.getString("lastName"),rs.getString("phone"),rs.getString("email"),rs.getString("city"),rs.getString("userName"));
			}
			rs.close();
		}
		return contact;
	}
	
	@Override
	public boolean addContact(Contact contact) throws SQLException {
		
		String query = "INSERT INTO imenik.contact (name,lastName,phone,email,city,userName) VALUES (?, ?, ?, ?, ?, ?)";
		
		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, contact.getName());
			ps.setString(2, contact.getLastName());
			ps.setString(3, contact.getPhone());
			ps.setString(4, contact.getEmail());
			ps.setString(5, contact.getCity());
			ps.setString(6, contact.getUserName());
			
			ps.executeUpdate();
			
			return true;
		}		
	}
	

	@Override
	public boolean updateContact(String name, String lastName, String phone, String email, String city, int contactID) throws SQLException {
		
		String query = "UPDATE imenik.contact SET name = ? lastName = ?, phone = ? email = ? city = ? WHERE conctactID = ?";
		
		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, name);
			ps.setString(2, lastName);
			ps.setString(3, phone);
			ps.setString(4, email);
			ps.setString(5, city);
			ps.setInt(6, contactID);
			
			ps.executeUpdate();
			
			return true;
		}
	}

	@Override
	public boolean deleteContact(int contactID) throws SQLException {
		
		String query = "DELETE FROM imenik.contact WHERE contactID = ?";
		
		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, contactID);
			ps.executeUpdate();
			
			return true;
		}
	}

}
