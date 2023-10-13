<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
	
		public int add(int i, int j){
		return i+j;
		
	}
	%>
	<h1>This is From JSp</h1>
	<%
		int i=1;
		int j=2;
		int k=i+j;
		out.println("Value of K "+k);
	%>
	The Value of i = <%=i%> & j = <%=j %> so i+j= <%=k %>
	The Value of  i+j= <%=add(3,5) %>
	
</body>
</html>