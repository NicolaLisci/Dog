package it.ats.controllo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.ats.modello.Utente;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DAOUtente;
import it.ats.persistenzaImpl.DAOUtenteImpl;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		DAOUtente daoUtente = new DAOUtenteImpl();
		try {
			int utenteExists = daoUtente.findByUserPass(username, password);
			if (utenteExists != -1) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.forward(request, response);
			} else {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("errore.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

}
