<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%!
	public void jspInit(){
	String defaultUser = getServletConfig().getInitParameter("defaultUser");
	ServletContext context = getServletContext();
	
	context.setAttribute("defaultUser", defaultUser);
}
%>
</head>
<body>
the default user is =  <%=getServletConfig().getInitParameter("defaultUser")%>
<hr/>
the Value in the ServletContext is <%=getServletContext().getAttribute("defaultUser") %>

</body>
</html>