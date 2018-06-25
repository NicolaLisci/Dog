package it.ats.controllo;

import java.io.IOException;

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
import it.ats.persistenza.DAORazza;
import it.ats.persistenza.impl.DAOCaneImpl;
import it.ats.persistenza.impl.DAORazzaImpl;

//@WebServlet("/PassaggioCane")
public class PassaggioCane extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PassaggioCane() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try
		{
			int idCane=Integer.parseInt(request.getParameter("idCane"));
			DAOCane daoCane=new DAOCaneImpl();
			
			Cane cane=daoCane.vediTutto(idCane);
			HttpSession session=request.getSession();
			DAORazza daoRazza=new DAORazzaImpl();
			String nome=daoRazza.findById(cane.getIdRazza());
			System.out.println(idCane);
			session.setAttribute("cane", cane);
			session.setAttribute("razza", nome);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("profiloCane.jsp");
			requestDispatcher.forward(request, response);
		}catch(NullPointerException |DAOException e)
		{
			System.out.println("nessun cane");
		}
	}

}
