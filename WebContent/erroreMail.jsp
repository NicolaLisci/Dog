<%@ page import = "it.ats.modello.*"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Errore</title>
</head>
<body>
	Impossibile inviare la mail al momento, riprova più tardi.
	
	<form action="MailRegistrazione" method="POST">
	<input type="hidden" name="mail" value="${utente.geteMail()}">
	<input type="hidden" name="user" value="${utente.getUsername()}">
	<input type="submit" name="invia" value="Reinvia Mail">
	</form>
	
	
	<%

		Utente utente = new Utente();
		utente = (Utente) request.getAttribute("utente");
	%>







	
</body>
</html>