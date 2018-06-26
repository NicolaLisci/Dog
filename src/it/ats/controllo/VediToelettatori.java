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
import it.ats.persistenza.DAODogSitter;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DAOToelettatore;
import it.ats.persistenza.impl.DAODogSitterImpl;
import it.ats.persistenza.impl.DAOToelettatoreImpl;

/**
 * Servlet implementation class VediToelettatori
 */
//@WebServlet("/VediToelettatori")
public class VediToelettatori extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VediToelettatori() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOToelettatore daoToelettatore=new DAOToelettatoreImpl();
		try
		{
			List<Utente>listaToelettatori=daoToelettatore.vediTutto();
			HttpSession session=request.getSession();
			session.setAttribute("listaToelettatori", listaToelettatori);

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("vediToelettatori.jsp");
			requestDispatcher.forward(request, response);
		}catch(DAOException e)
		{
			System.out.println(e.getMessage());
		}
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
