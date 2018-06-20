package it.ats.controllo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			System.out.println(idCane);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("profiloCane.jsp");
			requestDispatcher.forward(request, response);
		}catch(NullPointerException e)
		{
			System.out.println("nessun cane");
		}
	}

}
