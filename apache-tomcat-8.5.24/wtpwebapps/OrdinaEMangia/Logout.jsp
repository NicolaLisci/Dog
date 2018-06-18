<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
</head>
<body>

<% 

session.setAttribute("username", null); %>



<form class="singup-form" action="http://localhost:13160/OrdinaEMangia/Logout" method="POST">
<input id='logout' type="submit" value="Logout"> </input>

</form>


<h3> Ti ringraziamo per aver usufruito del nostro servizio</h3>
<% 
//RICORDA DI MODIFICARE home di ordina e mangia

//response.sendRedirect("http://localhost:13160/OrdinaEMangia/Login.html");
%>
</body>
</html>