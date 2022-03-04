<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="NavBar.jsp"%>
<%
String msg1 = (String) request.getAttribute("Key");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
</head>
<body>
<form action="">
	<h1>Welcome Admin.......</h1>
	<h1>login Successfull</h1>

	<%=msg1%>
	</form>
</body>
</html>