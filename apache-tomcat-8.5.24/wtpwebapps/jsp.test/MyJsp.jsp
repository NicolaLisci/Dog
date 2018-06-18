<%@ page import="java.util.Date" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>*** Esempio jsp ***</title>
</head>
<body bgcolor=Purple>

<font face=Verdana color=white>
<% Date d = new Date(); %>
Data attuale: <b><%= d.getDate() %>/<%= d.getMonth()+1 %>/<%=
d.getYear()+1900 %> <br></b>
Segnale orario: sono le <b><%= d.getHours() %>:<%=
d.getMinutes() %> </b>
</body>
</html>

