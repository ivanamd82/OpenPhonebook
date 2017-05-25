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
	public ArrayList<Contact> getContactsBO(String userName) {
		
		try {
			if (userName == "") {
				return null;
			}
			else {
				contacts = contactDAO.getContacts(userName);
				return contacts;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Contact getContactBO(int contactID) {
		try {
			if (contactID == 0) {
				return null;
			}
			else {
				contact = contactDAO.getContact(contactID);
				return contact;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean addContactBO(Contact contact) {
		try {
			if (contact == null) {
				return false;
			}
			else {
				if (contact.getName() == "" || contact.getPhone() == "" || contact.getUserName() == "") {
					return false;
				}
				else {
					return contactDAO.addContact(contact);
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
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
