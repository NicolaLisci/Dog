<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
     
<html>
<head><title>*** Registrazione ***</title></head>
<body >
<div>
    <form class="singup-form" action="http://localhost:8081/OrdinaEMangia/Registrazione_Utente" method="GET">
  
   <div class="#">
    <label for="exampleInputNome">Nome</label>
    <input type="text" class="#" id="exampleInputNome" placeholder="Nome" name="nome" required>
  </div>
  
  
   <div class="#">
    <label for="exampleInputCognome">Cognome</label>
    <input type="text" class="#" id="exampleInputCognome" placeholder="Cognome" name="cognome" required>
  </div>
  
  <div class="#">
    <label for="exampleInputTel">Username</label>
    <input type="text" class="#" id="exampleInputUsername" placeholder="Username" name="username" required>
  </div>
  
   <div class="#">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="#" id="exampleInputPassword1" placeholder="Password" name="password" required>
  </div>
  
  
  <div class="#">
    <label for="exampleInputEmail1">Email</label>
    <input type="email" class="#" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="email" required>
    
  </div>
 

    
      <div class="#">
    <label for="exampleInputTel">Residenza</label>
    <input type="text" class="# id="exampleInputResidenza" placeholder="Residenza" name="residenza" required>
  </div>
    
  <button name="registra" value="Registrati" type="submit" class="#">Registrati</button>
	   </form>                       
     </div>
    <div class="#"></div>
  </div>
</div>


    		<!-- inserire footer -->
<%-- <%@ include file=""%>    --%>   		
</body>
</html>