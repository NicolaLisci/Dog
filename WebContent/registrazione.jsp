<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<script>
function is_email(email){      
	var emailReg = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
	return emailReg.test(email); }
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
	<form action="Registrazione" method="POST">
		<input type="text" id="username" name="username" placeholder="Nome utente" required/>
		<br>
		<input type="text" id="nome" name="nome" placeholder="Nome" required/>
		<br>
		<input type="text" id="cognome" name="cognome" placeholder="Cognome" required/>
		<br>
		<input type="radio" name="gender" value="male" checked> Maschio<br>
		<input type="radio" name="gender" value="female"> Femmina<br>
		<input type="radio" name="gender" value="other"> Altro
		<br>
		<input type="email" id="email" name="email" placeholder="Email"  required/>
		<br>
		<input type="password" id="password" name="password" placeholder="Password" required/>
		<br>
		<label for="nascita">Data di nascita:  </label>
		<br>
		<input type='date' name='nascita' placeholder='DD/MM/YYYY' pattern="(?:19|20)[0-9]{2}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-9])|(?:(?!02)(?:0[1-9]|1[0-2])-(?:30))|(?:(?:0[13578]|1[02])-31))" required >
	
		<input type="submit" value="REGISTRATI"/>
		
	</form>
</body>
</html>

