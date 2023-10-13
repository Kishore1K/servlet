package com.servlet.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.mvc.dto.User;
import com.servlet.mvc.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String usname= request.getParameter("uname");
		String pass = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean res = loginService.authenticate(usname, pass);
		
		if(res) {
			User user = loginService.getUserName(usname);
			request.setAttribute("user", user);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.jsp");
			requestDispatcher.forward(request, response);
			/*
			 * request.getSession().setAttribute("user", user);
			 * response.sendRedirect("success.jsp");
			 */
			
			return;
		}else {
			response.sendRedirect("login.jsp");
			return;
		}
		
		
	}

}
