package it.ats.controllo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.ats.modello.Utente;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DAOUtente_Ruolo;
import it.ats.persistenza.impl.DAOUtente_RuoloImpl;

/**
 * Servlet implementation class CambiaRuoloMail
 */
@WebServlet("/CambiaRuoloMail")
public class CambiaRuoloMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CambiaRuoloMail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		int ruolo = Integer.parseInt(request.getParameter("ruolo"));
		DAOUtente_Ruolo daoUtente_Ruolo = new DAOUtente_RuoloImpl();
		try {
			

			if (id != 0) {

				daoUtente_Ruolo.saveIdRuolo(id, ruolo);

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("modificatoSuccesso.jsp");
				requestDispatcher.forward(request, response);
			} else {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("errore.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
