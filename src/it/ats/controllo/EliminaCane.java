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

import it.ats.modello.Cane;
import it.ats.persistenza.DAOCane;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.impl.DAOCaneImpl;

/**
 * Servlet implementation class EliminaCane
 */
//@WebServlet("/EliminaCane")
public class EliminaCane extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminaCane() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOCane daoCane=new DAOCaneImpl();
		HttpSession session=request.getSession();
		int idCane=(int)session.getAttribute("idCane");
		
		try {

			daoCane.elimina(idCane);
			System.out.println("cane eliminato");
			daoCane=new DAOCaneImpl();

			
			daoCane=new DAOCaneImpl();
            List<Cane> listaCane=new ArrayList<Cane>();
            
            listaCane = daoCane.elencoCani((int)session.getAttribute("id_utente"));
            
            session.setAttribute("listaCani", listaCane);
			
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(request, response);
		} catch (DAOException e) {
			System.out.println(e.getMessage());
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
