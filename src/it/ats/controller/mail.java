public class SendEmail estende HttpServlet {
    
  pubblico doGet void (richiesta HttpServletRequest,
                    HttpServletResponse risposta)
            getta ServletException, IOException
  {
      // ID e-mail del destinatario
      String a = "abcd@gmail.com";
 
      // E-mail ID del mittente
      String da = "web@gmail.com";
 
      // Diciamo che si invia host di posta elettronica String = "localhost" dall'host locale;
 
      // Ottenere le proprietà di sistema proprietà = System.getProperties ();
 
      // Impostare un properties.setProperty server di posta ( "mail.smtp.host", ospite);
 
      // Ottenere la sessione predefinita dell'oggetto Session Session = Session.getDefaultInstance (proprietà);
      
      // Impostare il tipo di contenuto della risposta response.setContentType ( "text / html; charset = UTF-8");
      PrintWriter out = response.getWriter ();

      try {
         // Crea un default MIMEMessage oggetti MIMEMessage messaggio = new MIMEMessage (sessione);
         // Imposta il campo Da: intestazione dell'intestazione.
         message.setFrom (nuova InternetAddress (da));
         // Impostato su: campo di intestazione dell'intestazione.
         message.addRecipient (Message.RecipientType.TO,
                                  nuova InternetAddress (a));
         // Imposta il Oggetto: campo di intestazione
         message.setSubject ( "Questa è la riga dell'oggetto!");
         // Ora impostare il messaggio effettivo message.setText ( "Questo è il messaggio vero e proprio");
         // Invia il messaggio Transport.send (messaggio);
         Titolo String = "email";
         res String = "inviare correttamente i messaggi ...";
         String docType = "\ n <DOCTYPE html!>";
         out.println (docType +
         "<HTML> \ n" +
         "<Head> <title>" + titolo + "</ title> </ head> \ n" +
         "<Body bgcolor = \" # f0f0f0 \ "> \ n" +
         "<H1 align = \" centro \ ">" + titolo + "</ h1> \ n" +
         "<P align = \" centro \ ">" + res + "</ p> \ n" +
         "</ Body> </ html>");
      } Catch (MessagingException mex) {
         mex.printStackTrace ();
      }
   }
} 