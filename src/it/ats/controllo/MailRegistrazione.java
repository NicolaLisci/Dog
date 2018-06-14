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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.ats.modello.Utente;

/**
 * Servlet implementation class MailRegistrazione
 */
@WebServlet("/MailRegistrazione")
public class MailRegistrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MailRegistrazione() {
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
		Utente utente = (Utente) request.getAttribute("utente");
		String username = "";
		String destinatario = "";
		System.out.println("utente mail1:"+utente);
		
		if(utente==null)
		{
			username = request.getParameter("user");
			destinatario = request.getParameter("mail");	
		}else
		{
			username = utente.getUsername();
			destinatario = utente.geteMail();
		}
	
		
		System.out.println(username);
		System.out.println(destinatario);
		
		

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
	         message.setText("Ciao "+username+".\n"
	         		+ "Benvenuto su Woof, clicca sul link sottostante per completare la registrazione!" );
	         
	         Transport.send(message,user,password);
//	         String title = "Send Email";
//	         String res = "Sent message successfully....";
	         
	      } catch (MessagingException mex) {
	    	  request.setAttribute("utente", utente);
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
	      
	  	RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");

	  	requestDispatcher.forward(request, response);

	
	}

}

