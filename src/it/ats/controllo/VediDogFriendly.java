package it.ats.controllo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.ats.modello.DogFriendly;
import it.ats.persistenza.DAODogFriendly;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.impl.DAODogFriendlyImpl;


//@WebServlet("/VediDogSitter")
public class VediDogFriendly extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public VediDogFriendly() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAODogFriendly daoDogFriendly=new DAODogFriendlyImpl();
		try
		{
			List<DogFriendly>listDogFriendly=daoDogFriendly.findAll();
			HttpSession session=request.getSession();
			session.setAttribute("listaDogFriendly", listDogFriendly);

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("vediDogFriendly.jsp");
			requestDispatcher.forward(request, response);
		}catch(DAOException e)
		{
			System.out.println(e.getMessage());
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

}
