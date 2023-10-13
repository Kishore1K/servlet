package com.servlet.javalib;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A sample Servlet Class", urlPatterns = { "/SimpleServlet" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello From Get Method");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name=  request.getParameter("uname");
		writer.println("<h1>Hello World From Servlet </h1>");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		
		if(name != "" || !name.isEmpty()) {
			session.setAttribute("savedName", name);
			context.setAttribute("savedName",name);
		}

		writer.println("Hello "+name);
		writer.println("Session "+(String)session.getAttribute("savedName"));
		writer.println("Context "+(String)context.getAttribute("savedName"));


		
	}

}
