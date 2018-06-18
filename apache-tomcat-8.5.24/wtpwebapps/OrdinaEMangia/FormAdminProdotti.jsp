<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
     
<html>
<head><title>*** Registrazione prodotti generici ***</title></head>
<body >
<div>
    <form class="singup-form" action="http://localhost:8081/OrdinaEMangia/Vetrina2" method="GET">
 
   <div class="#">
    <label for="exampleInputNomeProdotto">Nome Prodotto</label>
    <input type="text" class="#" id="exampleInputNomeProdotto" placeholder="Nome_prodotto" name="Nome_prodotto" required>
  </div>
  
  <div class="#">
    <label for="exampleInputNomeRistorante">Tipo prodotto</label>
    <input type="text" class="#" id="exampleInputTipoProdotto" placeholder="Tipo_Prodotto" name="Tipo_Prodotto" required>
  </div>

  <button name="registra" value="Registrati" type="submit" class="#">Registra i dati</button>
	   </form>                       
     </div>
    <div class="#"></div>
  </div>
</div>


    		<!-- inserire footer -->
<%-- <%@ include file=""%>    --%>   		
</body>
</html>