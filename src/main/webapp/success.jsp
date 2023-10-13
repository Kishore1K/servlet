<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.servlet.mvc.dto.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>SuccessFull</h1>
	
	<%
		User user = (User) request.getAttribute("user");
	%>
	
	the User is = <%=user.getUserName() %>
		the Password is = <%=user.getPassword() %>
	
</body>
</html>