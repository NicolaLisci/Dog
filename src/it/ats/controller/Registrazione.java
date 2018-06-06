package it.ats.controllo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class RegistrazioneServlet
 */
public class RegistrazioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrazioneServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String stringMatricola = request.getParameter("matricola");

		String nome = request.getParameter("nome");

		String cognome = request.getParameter("cognome");

		Integer matricola = null;

		if (stringMatricola == null || "".equals(stringMatricola)) {

			errors.put("error_matricola", "Campo matricola non può essere vuoto");

		} else {

			try {

				matricola = Integer.parseInt(stringMatricola);

			} catch (NumberFormatException nfe) {

				errors.put("error_matricola", "Campo matricola deve essere un numero");

			}

		}

		if (nome == null || "".equals(nome)) {

			errors.put("error_nome", "Campo nome non può essere vuoto");

		}

		if (cognome == null || "".equals(cognome)) {

			errors.put("error_cognome", "Campo cognome non può essere vuoto");

		}

		if (errors.isEmpty()) {

			Studente studente = new Studente();

			studente.setMatricola(matricola);

			studente.setNome(nome);

			studente.setCognome(cognome);

			DAOStudente daoStudente = new DAOStudenteImpl();

			try {

				daoStudente.save(studente);

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("registrazioneSuccesso.jsp");

				requestDispatcher.forward(request, response);

			} catch (DAOException e) {

				System.out.println(e.getMessage());

				response.sendRedirect("error.jsp");

			}

		} else {

			for (Entry<String, String> entry : errors.entrySet()) {

				request.setAttribute(entry.getKey(), entry.getValue());

			}

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("registrazione.jsp");

			requestDispatcher.forward(request, response);

		}

	}

}
