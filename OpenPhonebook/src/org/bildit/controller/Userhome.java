package org.bildit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bildit.model.bo.ContactBO;
import org.bildit.model.dto.Contact;

@WebServlet("/userhome")
public class Userhome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String search = request.getParameter("searchContact");

		if (search != null) {
			HttpSession sesion = request.getSession();
			String userName = sesion.getAttribute("sessionName").toString();
			ContactBO contactBO = new ContactBO();
			ArrayList<Contact> contacts = contactBO.searchContactsBO(userName, search); 
			
			if (contacts != null) {
				request.setAttribute("contactList", contacts);
				
				RequestDispatcher success = request.getRequestDispatcher("view/listcontacts.jsp");
				success.forward(request, response);
			}
			else {
				RequestDispatcher view = request.getRequestDispatcher("view/userhome.jsp");
				view.forward(request, response);
			}
			
		}
		else {
			RequestDispatcher view = request.getRequestDispatcher("view/userhome.jsp");
			view.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
