<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Effettua pagamento</title>
</head>
<body>
<fieldset style="background-color: #ffcccc">
		<h1>Conferma</h1>


		<FORM name="pagamento" method="get"
			action="http://localhost:8081/OrdinaEMangia/PagamentoEffettuato">
		

	
			
				<h3>Tipo carta:	</h3>
				<br> <select type='text' name='tipocarta' required>
			<option value='Visa'>Visa</option> 
			<option value='Mastercard'>Mastercard</option> 
				<option value='American Express'>American Express</option> 
				</select><br>
				
				
				<br>
				<h3>Numero della carta:</h3>
				<br> <input type='text' name='numcarta' minlength='16' maxlength='16' required><br><br>
				<h3>Titolare:</h3>
				<br> <input type='text' name='titolare' required><br><br>
				<h3>Data scadenza: </h3>
				<br><input type='date' name='scadenza'  min='" + anno + "-" + mesezero + "-" + giornozero + "'  required><br><br>
				<h3>CVV:</h3>
				<br> <input type='text' name='CVV' minlength='3' maxlength='3' required><br><br>
				<input type ='hidden' name ='idprenotazione' value = '"+ idprenotazione + "'>
				
				<input type='submit' name="azione" value='Conferma'>
				
				
			
				</form>
				
			

</body>
</html>