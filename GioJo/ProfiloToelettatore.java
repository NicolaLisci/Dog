package it.ats.controllo;

import java.io.IOException;

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
 * Servlet implementation class ProfiloToelettatore
 */
//@WebServlet("/ProfiloToelettatore")
public class ProfiloToelettatore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfiloToelettatore() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("idToelettatore"));
		DAOUtente daoUtente=new DAOUtenteImpl();
		try
		{
		Utente utente=daoUtente.findUtenteById(id);
		HttpSession session=request.getSession();
		session.setAttribute("toelettatore", utente);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("profiloToelettatore.jsp");
		requestDispatcher.forward(request, response);
		}catch(DAOException e)
		{
			System.out.println("errore ProfiloToelettatore.java");
		}
		
	}

}
