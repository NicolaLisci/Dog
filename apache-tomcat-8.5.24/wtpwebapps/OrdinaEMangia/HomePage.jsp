<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ page import = "java.sql.ResultSet" %>
    <%@ page import = "java.sql.SQLException" %>
     <%@ page import = "ordinamangia.ConnessioneOrdinaEMangia" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ordina&Mangia</title>


 <script >
function Menu(links) {j window.location.href = links[links.selectedIndex].value;}

var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1}    
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 2000); // Change image every 2 seconds
}
</script>

<link rel="stylesheet" href="Cssfile.css" type="text/css" >

</head>
<body body ONLOAD="showSlides()">

<header>


<nav>

<ul>
  <li><a class="active" href="http://localhost:8090/OrdinaEMangia/HomePage.jsp"><b>Home</a></li>
  <li><a href="http://localhost:8090/OrdinaEMangia/Servizi.html"><b>Servizi</a></li>
  <li><a href="http://localhost:8090/OrdinaEMangia/Contatti.html"><b>Contatti</a>
    <li style="float:right"><a href="http://localhost:8090/OrdinaEMangia/Logout.jsp"><b>Logout</a></li>
    <li style="float:right"><a href="http://localhost:8090/OrdinaEMangia/Login.html"><b>Login</a></li>
  <li style="float:right"><a href="http://localhost:8090/OrdinaEMangia/Registrazione_2.jsp"><b>Registrazione</a></li>
  </li>
  
</ul>
</nav>

  <!-- Slideshow container -->
<div class="slideshow-container">

  <!-- Full-width images with number and caption text -->
  <div class="mySlides fade">
   
    <img src="Capture.PNG" style="width:100%">

  </div>

  <div class="mySlides fade">
    <img src="Capture.jpg" style="width:100%">
   
  </div>

  <div class="mySlides fade">
    <img src="Capture3.jpg" style="width:100%">
  </div>
<!-- Next and previous buttons -->
  <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
  <a class="next" onclick="plusSlides(1)">&#10095;</a>
</div>
<br>

<!-- The dots/circles -->
<div style="text-align:center">
  <span class="dot" onclick="currentSlide(1)"></span> 
  <span class="dot" onclick="currentSlide(2)"></span> 
  <span class="dot" onclick="currentSlide(3)"></span> 
</div>
  
</header>
<center>
<h1>Benvenuto su Ordina & Mangia.</h1>
<h3>Seleziona la tua citt&agrave; per avere il tuo pasto direttamente a casa tua!</h3>
</center>

 

</br>
</br>
</br>

<!-- inizio viola 

<center><select onChange='Menu(this)'width="800" height="650"><option value=”javascript:void(0)”>Scegli la tua città...</option><option value='http://localhost:8090/RamoAssicuraz/Servlet1'>Opzione 1</option>"
								<option value='http://localhost:8090/OrdinaEMangia/ServletCagliari'>Cagliari</option>
								<option value='http://localhost:8090/OrdinaEMangia/ServletAlghero'>Alghero</option>
								<option value='http://localhost:8090/OrdinaEMangia/ServletOristano'>Oristano</option>
								<option value='http://localhost:8090/OrdinaEMangia/ServletNuoro'>Nuoro</option>
								<option value='http://localhost:8090/OrdinaEMangia/ServletOlbia'>Olbia</option></select></center>
 -->

<sql:setDataSource driver="oracle.jdbc.OracleDriver" url="jdbc:oracle:thin:@//ACCENTU-8B056E6:1521/XE" user="CORSO_JAVA" password="admin" />
<%
String sql = "select distinct citta from vetrina";

ConnessioneOrdinaEMangia Connessione = new ConnessioneOrdinaEMangia();

ResultSet rs = Connessione.getResult(sql);

%>

<h3> <center> Scegli la tua citt&aacute </center><h3>

<%
try 
{
	%>
	<script> function Menu(links) {window.location.href=links[links.selectedIndex].value;}
	</script>
	<center><select onChange='Menu(this)'width="800" height="650"></center>
	<option value="javascript:void(0)">Scegli la tua citt&aacute...</option>	
	
	<%
while (rs.next()) 
{
	String city = rs.getString("citta");	

%>

<option value='http://localhost:8090/OrdinaEMangia/ServletRistoranti?p1=<%=city%>' > <%=city %></option>
<% } %>
</select>
<% } 

catch (SQLException e) 
{
	e.printStackTrace();
}
Connessione.closeConnection();
%>
<!-- <footer class="footer"> Ordina & Mangia S.R.L. P.IVA 09876509876 </footer>
 -->
</body>

</html>
