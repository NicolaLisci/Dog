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
	String nome = request.getParameter("nome");
	String taglia = request.getParameter("taglia");
	String chip = request.getParameter("chip");
	String sesso = request.getParameter("gender");
	String pelo = request.getParameter("pelo");
	String dataNascita = request.getParameter("dataNascita");
	String pedegree = request.getParameter("pedegree");
	
	Cane cane = new Cane();
	cane.setNome(nome);
	cane.setTaglia(taglia);
	cane.setSesso(sesso);
	cane.setChip(chip);
	cane.setPelo(pelo);
	cane.setDataNascita("14/Nov/00");
	cane.setPedegree(pedegree);
	cane.setIdCane(1);
	cane.setIdRazza(1);

	
	DAOCane daoCane = new DAOCaneImpl();
	
	try {
	daoCane.salva(cane);
	System.out.println("Registrazione avvenuta con successo");
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("RegistrazioneCane.jsp");
	requestDispatcher.forward(request, response);
		
		
	} catch (DAOException e) {
		System.out.println(e.getMessage());
	}
	
	
	
	
		
	}

}
