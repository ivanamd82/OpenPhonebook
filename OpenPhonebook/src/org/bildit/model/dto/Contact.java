package org.bildit.model.dto;

public class Contact {
	
	private int contactID;
	private String name;
	private String lastName;
	private String phone;
	private String email;
	private String city;
	private String userName;
	
	public Contact(int contactID, String name, String lastName, String phone, String email, String city, String userName ){
		this.contactID = contactID;
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.city = city;
		this.userName = userName;		
	}

	public int getContactID() {
		return contactID;
	}

	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getCity() {
		return city;
	}

	public String getUserName() {
		return userName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String toString() {
		return "ID: "+getContactID()+" IME: "+getName()+" PREZIME: "+getLastName()+" BROJ: "+getPhone()+" EMAIL: "
				+getEmail()+"GRAD: "+getCity();
	}
	
}
