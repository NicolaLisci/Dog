package it.ats.controllo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DiventaToelettatore
 */
//@WebServlet("/DiventaToelettatore")
public class DiventaToelettatore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiventaToelettatore() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("user");
		String mail = request.getParameter("mail");	
		String destinatario ="liscinicola@live.it";
		String link = "http://localhost:8081/Woof3/CambioRuolo?id="+id;
		
		final String mittente = "woofaccenture@gmail.com";
		final String user = "woofaccenture@gmail.com";
		final String password = "Woof1234";
		
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host" , "smtp.gmail.com");
		properties.put("mail.smtp.auth", "true"); 
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.socketFactory.port", 587);
		properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.port", 587);
		properties.put("mail.smtp.timeout", 1000);
		properties.put("mail.smtp.connectiontimeout", 1000);
		
  
        Session session = Session.getInstance(properties, new javax.mail.Authenticator(){
      		        protected PasswordAuthentication getPasswordAuthentication() {
      		            return new PasswordAuthentication(user, password);
      		        }
      		});
        
        Message msg = new MimeMessage(session);
        response.setContentType("text/html");
	    try {
			PrintWriter out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	      try {

	         MimeMessage message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(mittente));
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
	         message.setSubject("Registrazione Woof");
	       //  System.out.println(utente.getUsername());
	         message.setText("L'utente "+username+" desidera diventare Toelettatore.\n"
	         		+ "Clicca sul link per confermare il passaggio di ruolo."+".\n.\n"+
	        		 link);
	         
	         Transport.send(message,user,password);
//	         String title = "Send Email";
//	         String res = "Sent message successfully....";
	         
	      } catch (MessagingException mex) {
	    	 // request.setAttribute("utente", utente);
	    	  RequestDispatcher requestDispatcher = request.getRequestDispatcher("erroreMail.jsp");
				try {
					requestDispatcher.forward(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	      }
	      
	request.getRequestDispatcher("index.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
