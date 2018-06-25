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
 * Servlet implementation class RegistrazioneCaneServlet
 */
// @WebServlet("/RegistrazioneCaneServlet")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String taglia = request.getParameter("taglia");
		String chip = request.getParameter("chip");
		String sesso = request.getParameter("gender");

		String dataNascita = request.getParameter("nascita");
		int pedegree = Integer.parseInt(request.getParameter("pedegree"));
		String pelo = request.getParameter("pelo");
		String nome = request.getParameter("nome");
		HttpSession session=request.getSession();
		int razza=Integer.parseInt(request.getParameter("razza"));
		System.out.println(razza);
		Cane cane = new Cane();

		cane.setTaglia(taglia);
		cane.setChip(chip);
		cane.setSesso(sesso);
		cane.setPathFoto("foto");
		cane.setPelo(pelo);
		cane.setDataNascita(dataNascita);
		cane.setPedegree(pedegree);
		int idUtente=(int) session.getAttribute("id_utente");
		cane.setIdUtente(idUtente);

		cane.setIdRazza(razza);
		cane.setNome(nome);

		
		
		
		
		DAOCane daoCane = new DAOCaneImpl();

		try {
			daoCane.salva(cane);
			System.out.println("Registrazione avvenuta con successo");
			
			daoCane=new DAOCaneImpl();
            List<Cane> listaCane=new ArrayList<Cane>();
            
            listaCane = daoCane.elencoCani((int)session.getAttribute("id_utente")); 
            session.setAttribute("listaCani", listaCane);
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(request, response);
			
		} catch (DAOException e) {
			System.out.println("errore servlet");
			System.out.println(e.getMessage());
		}

	}

}
