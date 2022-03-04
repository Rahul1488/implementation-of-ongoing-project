<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <% String msg=(String)  request.getAttribute("Key"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null && !msg.isEmpty()) {%>
<%=msg %>
<%} %>
<form action="./login" method="post">
<h1> Enter the Admin Name:<input type="text" name="name"></h1><br>
<h1>Enter the Password:<input type="text" name="password"></h1><br>
<input type="submit" value="login">
</form>
</body>
</html>