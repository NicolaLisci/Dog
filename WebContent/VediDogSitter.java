package it.ats.controllo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.ats.modello.Utente;
import it.ats.persistenza.DAODogSitter;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.impl.DAODogSitterImpl;


//@WebServlet("/VediDogSitter")
public class VediDogSitter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public VediDogSitter() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAODogSitter daoDogSitter=new DAODogSitterImpl();
		try
		{
			List<Utente>listaDogSitter=daoDogSitter.vediTutto();
			HttpSession session=request.getSession();
			session.setAttribute("listaDogSitter", listaDogSitter);

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("vediDogSitter.jsp");
			requestDispatcher.forward(request, response);
		}catch(DAOException e)
		{
			System.out.println(e.getMessage());
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

}
