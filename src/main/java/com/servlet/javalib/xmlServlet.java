package com.servlet.javalib;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

public class xmlServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>This is From get method </h1>");
		String uname = req.getParameter("uname"); 
		String email = req.getParameter("email");
		writer.println("<h1>This is From /XMLServlet 1 </h1>");
		writer.println("Hello "+uname+" Id is "+email);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>This is From Post method </h1>");
		String uname = req.getParameter("uname"); 
		String email = req.getParameter("email");
		String prof = req.getParameter("prof"); 
		String[] loc = req.getParameterValues("loc");
		writer.println("<h1>This is From /XMLServlet 1 </h1>");
		writer.println("Hello "+uname+" Id is "+email + " profession is "+prof + "\n Loc");
		for(String lString : loc) {
			writer.println(lString);
		}
		
		
	}

}
