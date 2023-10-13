<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clock</title>
</head>
<body>
	<%
		String user="Kishore";
	%>
	
	Time = <%=new Date() %>
	<%@include file="hello.jsp" %>
</body>
</html>