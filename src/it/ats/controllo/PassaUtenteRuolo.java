package it.ats.controllo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.ats.modello.Utente;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DAOUtente;
import it.ats.persistenza.DAOUtente_Ruolo;
import it.ats.persistenza.impl.DAOUtenteImpl;
import it.ats.persistenza.impl.DAOUtente_RuoloImpl;

//@WebServlet("/PassaUtenteRuolo")
public class PassaUtenteRuolo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PassaUtenteRuolo() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String UserName = request.getParameter("UserName");
		int idRuolo = Integer.parseInt(request.getParameter("idRuolo"));
		DAOUtente daoUtente = new DAOUtenteImpl();
		DAOUtente_Ruolo daoUtente_Ruolo = new DAOUtente_RuoloImpl();
		try {
			Utente utente = daoUtente.findUtenteByUsername(UserName);

			if (utente.getId() != 0) {

				daoUtente_Ruolo.saveIdRuolo(utente.getId(), idRuolo);

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("modificatoSuccesso.jsp");
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
