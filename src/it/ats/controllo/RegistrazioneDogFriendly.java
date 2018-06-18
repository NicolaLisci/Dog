package it.ats.controllo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.ats.modello.DogFriendly;

import it.ats.persistenza.DAODogFriendly;
import it.ats.persistenza.DAOException;

import it.ats.persistenza.impl.DAODogFriendlyImpl;
//@WebServlet("/RegistrazioneDogFriendly")
public class RegistrazioneDogFriendly extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public RegistrazioneDogFriendly() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idAttivita = request.getParameter("idAttivita");
		String NomeAttivita = request.getParameter("nomeAttivita");
		String indirizzo = request.getParameter("indirizzo");
	

      int idattivita=Integer.parseInt(idAttivita);
		DogFriendly dogFriendly = new DogFriendly();
		dogFriendly.setIdAttivita(idattivita);
		dogFriendly.setNomeAttivita(NomeAttivita);
		dogFriendly.setIndirizzo(indirizzo);
System.err.println(dogFriendly.getid_DogFriendly());
		System.out.println(dogFriendly.toString());

		DAODogFriendly daoDogFriendly = new DAODogFriendlyImpl();

		try {
			System.out.println("qui");
			daoDogFriendly.salva(dogFriendly);
			System.out.println("caricamento fatto");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("registrazioneSuccesso.jsp");
			requestDispatcher.forward(request, response);

		} catch (DAOException e) {
			
			System.out.println(e.getMessage());
			response.sendRedirect("error.jsp");

		}

		// RequestDispatcher requestDispatcher =
		// request.getRequestDispatcher("registrazione.jsp");

		// requestDispatcher.forward(request, response);

	}

}
