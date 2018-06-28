package it.ats.controllo;

import java.io.IOException;
import java.util.ArrayList;
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

/**
 * Servlet implementation class RimuoviUtente
 */
//@WebServlet("/RimuoviUtente")
public class RimuoviUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RimuoviUtente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DAOUtente daoUtente = new DAOUtenteImpl();
		HttpSession session = request.getSession();
		int idUtente = (int)session.getAttribute("id_utente");

		try {

			daoUtente.delete(idUtente);
			System.out.println("utente eliminato");

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(request, response);
		} catch (DAOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
