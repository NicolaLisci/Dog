<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! Integer x = new Integer(0); %>
<%
if(session.isNew()) // se non c'e' una sessione la crea 
{
 session.setAttribute("contatore", x); // mette x nella sessione
}
else 
{
 x=(Integer)session.getAttribute("contatore"); // legge il valore dalla sessione
 if(x == null) // se x non è presente..
 session.setAttribute("contatore", new Integer(1)); // lo inserisce con valore 1
 else // altrimenti lo incrementa e lo salva
 session.setAttribute("contatore", new Integer(x.intValue()+1));
}
%>
<p>Numero di accessi: <%= x.intValue() %> </p>
<p><a href="ContatoreDiAccessi.jsp">richiama la JSP</a></p>
<p><a href="ContatoreDiAccessi.jsp" target="_blank">richiama la JSP in una nuova pagina</a></p>

</body>
</html>