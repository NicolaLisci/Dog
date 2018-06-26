package it.ats.controllo;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.ats.modello.Cane;
import it.ats.modello.Utente;
import it.ats.modello.Utente_Ruolo;
import it.ats.persistenza.DAOCane;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DAOUtente;
import it.ats.persistenza.DAOUtente_Ruolo;
import it.ats.persistenza.impl.DAOCaneImpl;
import it.ats.persistenza.impl.DAOUtenteImpl;
import it.ats.persistenza.impl.DAOUtente_RuoloImpl;

//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println(email);
		System.out.println(password);
		
		String plaintext = password;
		MessageDigest m = null;
		try {
			m = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.reset();
		m.update(plaintext.getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1, digest);
		String hashtext = bigInt.toString(16);
		// Now we need to zero pad it if you actually want the full 32 chars.
		while (hashtext.length() < 32) {
			hashtext = "0" + hashtext;
		}
		password = hashtext;
		
		
		DAOUtente daoUtente = new DAOUtenteImpl();
		DAOUtente_Ruolo daoUtente_Ruolo = new DAOUtente_RuoloImpl();
		try {
			Utente utente = daoUtente.findUtente(email, password);
			System.out.println("utente:"+utente);
			Utente_Ruolo  utente_Ruolo =  daoUtente_Ruolo.findUtente(utente.getId());
			System.out.println(utente_Ruolo);
			
			
			if (utente.getId()!=0  ) {
				if(utente.getVerificato() !=0){
				HttpSession session=request.getSession();  

				session.setAttribute("utente", utente);
				session.setAttribute("id_utente",utente.getId());  
		        session.setAttribute("nome",utente.getNome());  
		        session.setAttribute("cognome",utente.getCognome());  
		        session.setAttribute("sesso",utente.getSesso());  
		        session.setAttribute("username",utente.getUsername());  
		        session.setAttribute("password",utente.getPassword());  
		        session.setAttribute("citta",utente.getCitta());  
		        session.setAttribute("foto",utente.getPathFoto());  
		        session.setAttribute("indirizzo",utente.getIndirizzo());  
		        session.setAttribute("verificato",utente.getVerificato());  
		        session.setAttribute("mail",utente.geteMail());  
		        session.setAttribute("telefono",utente.getnTelefono());  
		        session.setAttribute("nascita",utente.getDataNascita());  
		        
		        DAOCane daoCane=new DAOCaneImpl();
                List<Cane> listaCane=new ArrayList<Cane>();
                
                listaCane = daoCane.elencoCani(utente.getId()); 
                session.setAttribute("listaCani", listaCane);


				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.forward(request, response);
				}else{
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("verificatoError.jsp");
					requestDispatcher.forward(request, response);
				}
			} else {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("errore.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

}







/*
 DAOCane daoCane=new DAOCaneImpl();
                                  List<Cane> listaCane=new ArrayList<Cane>();
                                  
                                  try 
                                  {
	                              listaCane = daoCane.elencoCani(1); //da cambiare con il cane scelto
	                              //request.setAttribute("idCane", 61);
	                              System.out.println("Elenco ID");
                                  for(Cane cane : listaCane){
                                	  System.out.println(cane.getIdCane());
                                	  
                                	  %>
                                	  <li> 
                                	 
                                	  <form method= "POST" action="PassaggioCane">
                                	  
                                      <input type="hidden" name = "idCane" id="idCane" value= "<%=cane.getIdCane()%>"    />
                                	  <button type="submit" style="background-color: transparent; border-color: transparent;"> <%=cane.getNome()%></button>
                                	
                                	  
                                	  </form>
                                	  </li>
                                	  <%
                                  }
                                  } catch (DAOException e) {
			                      e.printStackTrace();
		                          }%>

*/