<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file="NavBar.jsp"%>
   <%String msg=(String) request.getAttribute("Key"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null && !msg.isEmpty()){ %>
<%=msg + "data inserted successfully"%>
<%} %>
<form action="./login" method="post">
<h5>Enter the User ID:<input type="number" name="userId"> </h5><br>
<h5>Enter the User Name:<input type="text" name="userName"> </h5><br>
<h5>Enter the User Age:<input type="number" name="age"> </h5><br>
<h5>Enter the User Address:<input type="text" name="add"> </h5><br>
<h5>Enter the User Phone Number:<input type="text" name="ph_no"> </h5><br>
<input type="submit" value="insert">


</form>

</body>
</html>