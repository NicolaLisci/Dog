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
import it.ats.persistenza.impl.DAOCaneImpl;

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

			

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		

	String taglia = request.getParameter("taglia");
	String chip = request.getParameter("chip");
	String sesso = request.getParameter("gender");

	String dataNascita = request.getParameter("nascita");
    int pedegree=Integer.parseInt(request.getParameter("pedegree"));
	String pelo=request.getParameter("pelo");
	String nome=request.getParameter("nome");

	Cane cane = new Cane();

	
	cane.setTaglia(taglia);
	cane.setChip(chip);
	cane.setSesso(sesso);
	cane.setPathFoto("foto");
	cane.setPelo(pelo);
	cane.setDataNascita(dataNascita);
	cane.setPedegree(pedegree);
	cane.setIdUtente(3); 
	cane.setIdRazza(3);
	cane.setNome(nome);
	
	

	
	

	
	DAOCane daoCane = new DAOCaneImpl();
	
 try {
	daoCane.salva(cane);
	System.out.println("Registrazione avvenuta con successo");

		
	} catch (DAOException e) {
		System.out.println("errore servlet");
		System.out.println(e.getMessage());
	}
	
	
	
	
		
	}

}
