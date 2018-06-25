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
			int razza=Integer.parseInt(request.getParameter("razza"));
			HttpSession session=request.getSession();
			int idCane=Integer.parseInt(request.getParameter("idCane"));
			Cane cane = new Cane();
			
			cane.setPathFoto("foto");
			cane.setIdCane(idCane);
			cane.setNome(nome);
			cane.setTaglia(taglia);
			cane.setSesso(sesso);
			cane.setChip(chip);
			cane.setPelo(pelo);
			cane.setDataNascita(dataNascita);
			cane.setPedegree(pedegree);
			cane.setIdUtente((int)session.getAttribute("id_utente"));
			cane.setIdRazza(razza);

			System.out.println(cane);
			DAOCane daoCane = new DAOCaneImpl();
			
			try {
			daoCane.aggiorna(cane);
			System.out.println("Modifica avvenuta con successo");

			daoCane=new DAOCaneImpl();
            List<Cane> listaCane=new ArrayList<Cane>();
            
            listaCane = daoCane.elencoCani((int)session.getAttribute("id_utente")); 
            session.removeAttribute("listaCani");
            session.setAttribute("listaCani", listaCane);
			
			
			
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(request, response);
				
				
			} catch (DAOException e) {
				System.out.println(e.getMessage());
	}

		}
}
