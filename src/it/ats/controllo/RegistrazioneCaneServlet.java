package it.ats.controllo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.ats.modello.Cane;
import it.ats.persistenza.DAOCane;
import it.ats.persistenza.DAOException;
import it.ats.persistenzaImpl.DAOCaneImpl;

/**
 * Servlet implementation class RegistrazioneCaneServlet
 */
@WebServlet("/RegistrazioneCaneServlet")
public class RegistrazioneCaneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrazioneCaneServlet() {
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
	
		//DA COMPLETARE
	String taglia = request.getParameter("taglia");
	String chip = request.getParameter("chip");
	String sesso = request.getParameter("gender");

	String dataNascita = request.getParameter("nascita");
	

	Cane cane = new Cane();

	cane.setIdUtente(2);
	cane.setIdRazza(2);
	cane.setTaglia(taglia);
	cane.setChip(chip);
	cane.setSesso(sesso);
	cane.setPelo("lungo");
	cane.setDataNascita(dataNascita);
	cane.setPedegree(1);
	
	
	DAOCane daoCane = new DAOCaneImpl();
	
	try {
	daoCane.salva(cane);
	System.out.println("Registrazione avvenuta con successo");

		
	} catch (DAOException e) {
		System.out.println(e.getMessage());
	}
	
	
	
	
		
	}

}
