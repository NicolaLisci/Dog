<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
	<form action="Registrazione" method="POST">
		<input type="text" id="username" name="username" placeholder="Nome utente" required /> <br> 
		<input type="text" id="nome" name="nome" placeholder="Nome" required /> <br> 
		<input type="text" id="cognome" name="cognome" placeholder="Cognome" required /> <br> 
		<input type="radio" name="gender" value="male" checked> Maschio<br> 
		<input type="radio" name="gender" value="female"> Femmina<br> 
		<input type="radio"	name="gender" value="other"> Altro <br> 
		<input type="text" id="email" name="email" placeholder="Email" onblur="validateEmail(this);" required /> <br> 
		<input type="password" id="password" name="password" placeholder="Password"	required /> <br> 
		<label for="nascita">Data di nascita: </label> <input type="date" name="nascita" placeholder="(DD/MM/YYYY)"> <br> 
		
		<input type="text" name="citta" placeholder="Citta"> <br> 
		<input type="text" name="indirizzo" placeholder="Indirizzo"> <br>
		<input type="text" name="numero" placeholder="Recapito telefonico">

		<br> <input type="submit" value="REGISTRATI" />
	</form>
</body>
</html>

