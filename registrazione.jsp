<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
	<form action="registrazione" method="POST">
		<input type="text" id="utente" name="utente" placeholder="Nome utente" />
		<br>
		<input type="text" id="nome" name="nome" placeholder="Nome" />
		<br>
		<input type="text" id="cognome" name="cognome" placeholder="Cognome" />
		<br>
		<input type="radio" name="gender" value="male" checked> Maschio<br>
		<input type="radio" name="gender" value="female"> Femmina<br>
		<input type="radio" name="gender" value="other"> Altro
		<br>
		<input type="text" id="email" name="email" placeholder="Email" />
		<br>
		<label for="nascita">Data di nascita: </label>
		<input type="date" name="nascita">
		<input type="submit" value="REGISTRATI"/>
	</form>
</body>
</html>
