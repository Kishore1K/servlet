<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
			String user = request.getParameter("uname");
			if(user != null){
				session.setAttribute("user", user);
				//application.setAttribute("user_app", user);
				pageContext.setAttribute("user", user);
				pageContext.setAttribute("user_app", user, pageContext.APPLICATION_SCOPE);
				pageContext.findAttribute("name"); 
			}
	%>
	<h1> Request  <%=user %></h1>
	<h1> Session <%=session.getAttribute("user") %></h1>
		<h1> Context <%=application.getAttribute("user") %></h1>
				<h1> pageContext <%=pageContext.getAttribute("user") %></h1>
	
</body>
</html>