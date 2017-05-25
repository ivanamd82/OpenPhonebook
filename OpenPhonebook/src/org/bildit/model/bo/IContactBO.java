package org.bildit.model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import org.bildit.model.dto.Contact;



public interface IContactBO {
	
	public ArrayList<Contact> getContactsBO(String userName) throws SQLException;
	
	public Contact getContactBO(int contactID) throws SQLException;
	
	public boolean addContactBO(String name, String lastName, String phone, String email, String city, String userName) throws SQLException;
	
	public ArrayList<Contact> searchContacts (String userName, String search) throws SQLException;

	public boolean updateContactBO(String name, String lastName, String phone, String email, String city, int contactID) throws SQLException;
	
	public boolean deleteContactBO(int contactID) throws SQLException;
	
}
