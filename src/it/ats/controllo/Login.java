package it.ats.controllo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.ats.modello.Utente;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DAOUtente;
import it.ats.persistenza.impl.DAOUtenteImpl;

@WebServlet("/Login")
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
		DAOUtente daoUtente = new DAOUtenteImpl();
		try {
			Utente utente = daoUtente.findUtente(email, password);
			System.out.println("utente:"+utente);
			
			if (utente.getId()!=0) {
				HttpSession session=request.getSession();  

				session.setAttribute("utente", utente);
//				session.setAttribute("id_utente",utente.getId());  
//		        session.setAttribute("nome",utente.getNome());  
//		        session.setAttribute("cognome",utente.getCognome());  
//		        session.setAttribute("sesso",utente.getSesso());  
//		        session.setAttribute("username",utente.getUsername());  
//		        session.setAttribute("password",utente.getPassword());  
//		        session.setAttribute("citta",utente.getCitta());  
//		        session.setAttribute("foto",utente.getPathFoto());  
//		        session.setAttribute("indirizzo",utente.getIndirizzo());  
//		        session.setAttribute("verificato",utente.getVerificato());  
//		        session.setAttribute("mail",utente.geteMail());  
//		        session.setAttribute("telefono",utente.getnTelefono());  
//		        session.setAttribute("nascita",utente.getDataNascita());  
		        
		    
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.forward(request, response);
			} else {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("errore.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

}
