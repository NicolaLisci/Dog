package it.ats.controllo;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.ats.modello.Utente;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DAOUtente;
import it.ats.persistenza.impl.DAOUtenteImpl;

/**
 * Servlet implementation class UpdateUtente
 */
//@WebServlet("/UpdateUtente")
public class UpdateUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUtente() {
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
		
		int id = Integer.parseInt(request.getParameter("id"));
		String foto = request.getParameter("foto");
		String username = request.getParameter("username");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String sesso = request.getParameter("gender");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String nascita =  request.getParameter("nascita");
		String indirizzo = request.getParameter("indirizzo");
		String telefono = request.getParameter("telefono");
		String citta = request.getParameter("citta");
		
		String plaintext = password;
		MessageDigest m = null;
		try {
			m = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.reset();
		m.update(plaintext.getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1, digest);
		String hashtext = bigInt.toString(16);
		// Now we need to zero pad it if you actually want the full 32 chars.
		while (hashtext.length() < 32) {
			hashtext = "0" + hashtext;
		}
		password = hashtext;		
		
		System.out.println("id: "+ id);
		System.out.println("foto: "+ foto);
		System.out.println("user: "+ username);
		System.out.println("nome: "+ nome);
		System.out.println("cognome: "+ cognome);
		System.out.println("sesso: "+ sesso);
		System.out.println("email: "+ email);
		System.out.println("password: "+ password);
		System.out.println("nascita:" +nascita);
		System.out.println("indirizzo: "+ indirizzo);
		System.out.println("telefono: " + telefono);
		System.out.println("citta: "+ citta);
		
		Utente utente = new Utente();
		utente.setId(id);
		utente.setPathFoto(foto);
		utente.setUsername(username);
		utente.setNome(nome);
		utente.setCognome(cognome);
		utente.setSesso(sesso);
		utente.seteMail(email);
		utente.setPassword(password);
		utente.setDataNascita(nascita);
		utente.setIndirizzo(indirizzo);
		utente.setnTelefono(telefono);
		utente.setCitta(citta);
		
		DAOUtente daoUtente = new DAOUtenteImpl();
	
		try {
			daoUtente.aggiorna(utente);
			System.out.println("aggiornato");
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(request, response);
		
		
	}

}
