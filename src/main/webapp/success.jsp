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
		User user1 = (User) request.getAttribute("user");
	%>
	<jsp:useBean  id="user" class="com.servlet.mvc.dto.User" scope="request"></jsp:useBean>
	the User is = <%=user.getUserName() %>
		the Password is = <%=user.getPassword() %>
		
		<hr/>
		the User is = <%=user1.getUserName() %>
		the Password is = <%=user1.getPassword() %>
		<hr/>
		the User is = <jsp:getProperty property="userName" name="user" />
		the Password is = <jsp:getProperty property="password" name="user"/>
	
</body>
</html>