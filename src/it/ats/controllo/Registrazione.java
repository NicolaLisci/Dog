package it.ats.controllo;

import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.ats.modello.Utente;


/**
 * Servlet implementation class RegistrazioneServlet
 */
public class Registrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registrazione() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String sesso = request.getParameter("gender");
		String email = request.getParameter("email");
		String nascita =  request.getParameter("nascita");
		
		System.out.println("user: "+ username);
		System.out.println("nome: "+ nome);
		System.out.println("cognome: "+ cognome);
		System.out.println("sesso: "+ sesso);
		System.out.println("email: "+ email);
		System.out.println("nascita:" +nascita);
		
		Utente utente = new Utente();
		utente.setUsername(username);
		utente.setNome(nome);
		utente.setCognome(cognome);
		utente.setSesso(sesso);
		utente.seteMail(email);
		
		
	//	utente.setNascita(nascita);
	

//
//			DAOStudente daoStudente = new DAOStudenteImpl();
//
//			try {
//
//				daoStudente.save(studente);
//
//				RequestDispatcher requestDispatcher = request.getRequestDispatcher("registrazioneSuccesso.jsp");
//
//				requestDispatcher.forward(request, response);
//
//			} catch (DAOException e) {
//
//				System.out.println(e.getMessage());
//
//				response.sendRedirect("error.jsp");
//
//			}
//
//		} else {
//
//			for (Entry<String, String> entry : errors.entrySet()) {
//
//				request.setAttribute(entry.getKey(), entry.getValue());
//
//			}
//
//			RequestDispatcher requestDispatcher = request.getRequestDispatcher("registrazione.jsp");
//
//			requestDispatcher.forward(request, response);

		//}

	}

}
