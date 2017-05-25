package org.bildit.model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import org.bildit.model.dao.ContactDAO;
import org.bildit.model.dto.Contact;

public class ContactBO implements IContactBO {
	
	ContactDAO contactDAO = new ContactDAO();
	Contact contact = null;
	ArrayList<Contact> contacts = new ArrayList<>();

	@Override
	public ArrayList<Contact> getContactsBO(String userName) throws SQLException {
		
		if (userName == "") {
			return null;
		}
		else {
			contacts = contactDAO.getContacts(userName);
			return contacts;
		}
	}

	@Override
	public Contact getContactBO(int contactID) throws SQLException {
		if (contactID == 0) {
			return null;
		}
		else {
			contact = contactDAO.getContact(contactID);
			return contact;
		}
	}

	@Override
	public boolean addContactBO(String name, String lastName, String phone, String email, String city, String userName) throws SQLException {
		
		if (userName == "") {
			return false;
		}
		else {
			if (name == "" || phone == "") {
				return false;
			}
			else {
				return contactDAO.addContact(name, lastName, phone, email, city, userName);
			}
		}
		
	}
	
	@Override
	public ArrayList<Contact> searchContacts (String userName, String search) throws SQLException {
		
		if (userName == "") {
			return null;
		}
		else {
			if(search == "") {
				return null;
			}
			else {
				contacts = contactDAO.searchContacts(userName, search);
				return contacts;
			}
		}
	}

	@Override
	public boolean updateContactBO(String name, String lastName, String phone, String email, String city, int contactID) throws SQLException {
		
		if (contactID == 0) {
			return false;
		}
		else {
			if (name == "" || phone == "") {
				return false;
			}		
			else {
				return contactDAO.updateContact(name, lastName, phone, email, city, contactID);
			}
		}
	}

	@Override
	public boolean deleteContactBO(int contactID) throws SQLException {
		
		if (contactID == 0) {
			return false;
		}
		else {
			return contactDAO.deleteContact(contactID);
		}
	}

	public void setContactDAO(ContactDAO contactDAO) {
		this.contactDAO = contactDAO;
	}

}
