<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
     
<html>
<head><title>*** Registrazione prodotti e ristoranti ***</title></head>
<body >
<div>
    <form class="singup-form" action="http://localhost:8081/OrdinaEMangia/Vetrina2" method="GET">
  
   <div class="#">
    <label for="exampleInputUserRistoratore">User Ristoratore</label>
    <input type="text" class="#" id="exampleInputUserRistoratore" placeholder="UserRistoratore" name="UserRistoratore" required>
  </div>
  
  
   <div class="#">
    <label for="exampleInputNomeProdotto">Nome Prodotto</label>
    <input type="text" class="#" id="exampleInputNomeProdotto" placeholder="Nome_prodotto" name="Nome_prodotto" required>
  </div>
  
  <div class="#">
    <label for="exampleInputNomeRistorante">Nome Ristorante</label>
    <input type="text" class="#" id="exampleInputNomeRistorante" placeholder="NomeRistorante" name="NomeRistorante" required>
  </div>
  
   <div class="#">
    <label for="exampleInputPrezzo">Prezzo</label>
    <input type="text" class="#" id="exampleInputPrezzo" placeholder="Prezzo" name="prezzo" required>
  </div>
  
  
  <div class="#">
    <label for="exampleInputCitta">Città</label>
    <input type="text" class="#" id="exampleInputCitta" placeholder="Citta" name="citta" required>
    
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