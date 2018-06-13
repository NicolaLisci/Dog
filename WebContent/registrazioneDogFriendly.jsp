<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aggiungi attività</title>
</head>
<body>
	<form action="RegistrazioneDogFriendly" method="POST">
    	<h3>Nome attivita</h3>
		<input type="text" id="nomeAttivita" name="nomeAttivita"
			placeholder="nome Attività" /> 
            <br><h3>Indirizzo</h3>
            <br> 
            <input type="text" id="indirizzo" name="indirizzo" placeholder=indirizzo /> 
			<br><select name="idAttivita" placeholder="idAttivita">
			<option value="1">Hotel</option>
			<option value="2">Pizzeria</option>
			<option value="3">Negozio</option>
			<option value="4">Caffettiera</option>
			<option value="5">Gelateria</option>
			<option value="6">Ristorante</option>
			<option value="7">Piscina</option>
			<option value="8">Spiaggia</option>
			<option value="9">Campeggio</option>
		</select> <input type="submit" value="INVIA" />
	</form>
</body>
</html>