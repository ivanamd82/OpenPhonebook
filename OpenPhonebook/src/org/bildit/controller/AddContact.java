package org.bildit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bildit.model.bo.ContactBO;
import org.bildit.model.dto.Contact;

@WebServlet("/addcontact")
public class AddContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("nameContact");
		String nameLContact = request.getParameter("nameLContact");
		String emailContact = request.getParameter("emailContact");
		String phoneContact = request.getParameter("phoneContact");
		String cityContact = request.getParameter("cityContact");
		
		if ( name != null && nameLContact != null) {			
			HttpSession sesion = request.getSession();
			String userName = sesion.getAttribute("sessionName").toString();
			ContactBO contactBO = new ContactBO();
			
			Contact contact = new Contact(name,phoneContact,userName);
			contact.setLastName(nameLContact);
			contact.setEmail(emailContact);
			contact.setCity(cityContact);
			
			boolean addConfirm = contactBO.addContactBO(contact);
			
			if (addConfirm) {
				RequestDispatcher view = request.getRequestDispatcher("view/userhome.jsp");
				view.forward(request, response);
				System.out.println("Dodan");
			}			
		}
		else {
			RequestDispatcher view = request.getRequestDispatcher("view/addcontact.jsp");
			view.forward(request, response);
		}
		
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
