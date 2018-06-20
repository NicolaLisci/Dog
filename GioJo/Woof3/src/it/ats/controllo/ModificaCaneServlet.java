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
 * Servlet implementation class ModificaCaneServlet
 */

@WebServlet("/ModificaCaneServlet")
public class ModificaCaneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificaCaneServlet() {
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
			String dataNascita = request.getParameter("nascita");
			int pedegree = Integer.parseInt(request.getParameter("pedegree"));
			
			//int idCane=(int)request.getAttribute("idCane");
			Cane cane = new Cane();
			
			cane.setIdCane(61);
			cane.setNome(nome);
			cane.setTaglia(taglia);
			cane.setSesso(sesso);
			cane.setChip(chip);
			cane.setPelo(pelo);
			cane.setDataNascita(dataNascita);
			cane.setPedegree(pedegree);
			cane.setIdUtente(1);
			cane.setIdRazza(1);

			System.out.println(cane);
			DAOCane daoCane = new DAOCaneImpl();
			
			try {
			daoCane.aggiorna(cane);
			System.out.println("Modifica avvenuta con successo");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(request, response);
				
				
			} catch (DAOException e) {
				System.out.println(e.getMessage());
	}

		}
}
