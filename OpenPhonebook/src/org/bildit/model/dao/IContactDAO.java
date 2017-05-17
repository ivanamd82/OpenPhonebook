package org.bildit.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.bildit.model.dto.Contact;

public interface IContactDAO {
	
	public ArrayList<Contact> getContacts(String userName) throws SQLException;
	
	public Contact getContact(int contactID) throws SQLException;
	
	public boolean addContact(String name, String lastName, String phone, String email, String city, String userName) throws SQLException;
	
	public boolean updateContact(String name, String lastName, String phone, String email, String city, int contactID) throws SQLException;
	
	public boolean deleteContact(int contactID) throws SQLException;
	
}
