<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="jsp.test.Connessione"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Echoing HTML Request Parameters</title>
</head>
<body>
	<%
		//Sto scrivendo in Java
		String[] authors = request.getParameterValues("author");
		if (authors != null) {
	%>
	<!--Sto scrivendo in html  -->
	<h3>Hai scelto i seguenti autori:</h3>
	<ul>
		<%
			//Sto scrivenfo in Java
				for (int i = 0; i < authors.length; i++) {
		%>
		<!--Sto scrivendo in html  -->
		<li><%=authors[i]%></li>

		<%
			//Sto scrivendo in Java
				}
		%>

		<!--Sto scrivendo in html  -->

	</ul>
	<input type=button value="Back" onClick="history.back()">
	<%
		//Sto scrivendo in Java
			String autore1 = authors[0];
			String autore2 = authors[1];

			//Query SQL
			String Sql = "Select autore, titolo FROM libro where autore= '" + autore1 + "' or autore = '" + autore2 + "'";
			out.println(Sql);
			//connessione al db
			Connessione MyConnection = new Connessione();
			//Eseguo query sql. il risultato è inserito nel ResultSet
			ResultSet rs = MyConnection.getResult(Sql);

			//lettura e stamoa di tutti i record del ResultSet
	%>
	<!--Sto scrivendo in html  -->
	<h2>Questi sono i libri che abbiamo degli autori scelti</h2>
	<ul>
		<%
			//Sto scrivendo in Java
				try {
					while (rs.next()) {//titolo è il nome della seconda colonna della tabella
						String autore = rs.getString("autore");
						String titolo = rs.getString("titolo");
				


		%>
		<!--Sto scrivendo in html  -->
		<li><h3> <%=autore%> <%=titolo%></h3></li>
		<%
			}

				} catch (SQLException e) {
					e.printStackTrace();
				}
				//Chiude la connessione al db e gli oggetti collegati (ResultSet e Statement)
				MyConnection.closeConnection();

			}
		%>
		<!--Sto scrivendo in html  -->
	</ul>
</body>
</html>