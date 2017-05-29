package org.bildit.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bildit.model.bo.UserBO;

@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if ( name != null && password != null) {
			UserBO userBO = new UserBO();
			boolean addConfirm = userBO.addUserBO(name, password);
			
			if(addConfirm) {
				
				RequestDispatcher success = request.getRequestDispatcher("view/login.jsp");
				success.forward(request, response);
			
			}
			else {
				request.setAttribute("message", "Korisnicko ime zauzeto!");
				request.setAttribute("link", "register");
				RequestDispatcher view = request.getRequestDispatcher("view/message.jsp");
				view.forward(request, response);
			}
		}
		else {
			RequestDispatcher view = request.getRequestDispatcher("view/register.jsp");
			view.forward(request, response);
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
