  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
   <%@ page import = "java.sql.ResultSet" %>
    <%@ page import = "java.sql.SQLException" %>
 <%@ page import = "ordinamangia.ConnessioneOrdinaEMangia" %>


<%@ page import="java.util.ArrayList"%>


<!DOCTYPE html>
<html>
<head>
<title>Carrello</title>
<SCRIPT language="JavaScript">
	function verifica() {
		/* se il campo da controllare è vuoto (value=""), mostra un alert e restituisci il true */
		if ((document.forms['login']['uname'].value == "")
				|| (document.forms['login']['psw'].value == "")) {
			alert("Controlla i campi vuoti");
			return false;
		} else {
			return true;
		}
	}
</SCRIPT>



</head>


<body>







	<fieldset style="background-color: #ffcccc">
		<h1>Carrello</h1>
		<div>
			<div
				style="font-family: Verdana; text-align: center; background-color: #ddd; border: 1px #ddd solid; width: 330px">
				Prodotti</div>

			<div style="border: 1px #ddd solid; width: 330px">
				<form method="GET" action="Carrello"
					style="margin-top: 5px; margin-bottom: 5px; position: relative;">


					<%
						ArrayList<String> nome = (ArrayList) session.getAttribute("nomeAL");
						ArrayList<String> prezzo = (ArrayList) session.getAttribute("prezzoAL");
						ArrayList<String> quantita = (ArrayList) session.getAttribute("quantitaAL");
						ArrayList<String> totale = (ArrayList) session.getAttribute("totaleAL");

						System.out.println(nome);
						int i1 = 0;
						int i2 = 0;
						int i3 = 0;
						int i4 = 0;
						try {
							for (String name : nome) {
					%>

					<p>
						<%=nome.get(i1)%>
					</p>
					<%
						i1++;
							}
						} catch (Exception e) {
							e.printStackTrace();
						}

						try {
							for (String price : prezzo) {
					%>

					<p>
						<%=prezzo.get(i2)%>
					</p>
					<%
						i2++;
							}
						} catch (Exception e) {
							e.printStackTrace();
						}

						try {
							for (String quantity : quantita) {
					%>

					<p>
						<%=quantita.get(i3)%>
					</p>
					<%
						i3++;
							}

						} catch (Exception e) {
							e.printStackTrace();
						}

						try {
							for (String tot : totale) {
					%>

					<p>
						<%=totale.get(i4)%>
					</p>

					<input type="submit" name="azione" value="rimuovi" >  

					<%
						i4++;

							}

						} catch (Exception e) {
							e.printStackTrace();
						}
					%>
				</form>
				
				
				
				
				<div>
				<form method="#" action="#" >
              
                <input type="submit" value="Continua con i tuoi acquisti"  />
            </form>
            </div>
            
            <div>
				<form method="get" action="http://localhost:8081/OrdinaEMangia/Pamento%20finale.jsp" >
               <input type="submit" value="Acquista"  />
            </form>
            </div>
</body>
</html>