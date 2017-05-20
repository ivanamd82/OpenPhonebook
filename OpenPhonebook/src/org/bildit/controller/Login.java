package org.bildit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bildit.model.bo.UserBO;
import org.bildit.model.dto.User;

@WebServlet("/login")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	String name, password;
		

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		name = request.getParameter("userName");
		password = request.getParameter("password");
		
		if ( name != null && password != null) {
			UserBO userBO = new UserBO();
			User user = userBO.getUserBO(name, password);
			if(user != null) {
				HttpSession session = request.getSession();
				session.setAttribute("sessionName", user.getName());
				
				RequestDispatcher view = request.getRequestDispatcher("view/userhome.jsp");
				view.forward(request, response);
				
			}
		}
		
		RequestDispatcher view = request.getRequestDispatcher("view/login.jsp");
		view.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
