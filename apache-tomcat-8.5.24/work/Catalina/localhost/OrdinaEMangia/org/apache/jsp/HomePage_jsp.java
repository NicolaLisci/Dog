/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.24
 * Generated at: 2018-05-15 13:38:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import ordinamangia.ConnessioneOrdinaEMangia;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("ordinamangia.ConnessioneOrdinaEMangia");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Ordina&Mangia</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <script >\r\n");
      out.write("function Menu(links) {j window.location.href = links[links.selectedIndex].value;}\r\n");
      out.write("\r\n");
      out.write("var slideIndex = 0;\r\n");
      out.write("showSlides();\r\n");
      out.write("\r\n");
      out.write("function showSlides() {\r\n");
      out.write("    var i;\r\n");
      out.write("    var slides = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("    var dots = document.getElementsByClassName(\"dot\");\r\n");
      out.write("    for (i = 0; i < slides.length; i++) {\r\n");
      out.write("       slides[i].style.display = \"none\";  \r\n");
      out.write("    }\r\n");
      out.write("    slideIndex++;\r\n");
      out.write("    if (slideIndex > slides.length) {slideIndex = 1}    \r\n");
      out.write("    for (i = 0; i < dots.length; i++) {\r\n");
      out.write("        dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("    }\r\n");
      out.write("    slides[slideIndex-1].style.display = \"block\";  \r\n");
      out.write("    dots[slideIndex-1].className += \" active\";\r\n");
      out.write("    setTimeout(showSlides, 2000); // Change image every 2 seconds\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Cssfile.css\" type=\"text/css\" >\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body body ONLOAD=\"showSlides()\">\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav>\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("  <li><a class=\"active\" href=\"http://localhost:8090/OrdinaEMangia/HomePage.jsp\"><b>Home</a></li>\r\n");
      out.write("  <li><a href=\"http://localhost:8090/OrdinaEMangia/Servizi.html\"><b>Servizi</a></li>\r\n");
      out.write("  <li><a href=\"http://localhost:8090/OrdinaEMangia/Contatti.html\"><b>Contatti</a>\r\n");
      out.write("    <li style=\"float:right\"><a href=\"http://localhost:8090/OrdinaEMangia/Logout.jsp\"><b>Logout</a></li>\r\n");
      out.write("    <li style=\"float:right\"><a href=\"http://localhost:8090/OrdinaEMangia/Login.html\"><b>Login</a></li>\r\n");
      out.write("  <li style=\"float:right\"><a href=\"http://localhost:8090/OrdinaEMangia/Registrazione_2.jsp\"><b>Registrazione</a></li>\r\n");
      out.write("  </li>\r\n");
      out.write("  \r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("  <!-- Slideshow container -->\r\n");
      out.write("<div class=\"slideshow-container\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Full-width images with number and caption text -->\r\n");
      out.write("  <div class=\"mySlides fade\">\r\n");
      out.write("   \r\n");
      out.write("    <img src=\"Capture.PNG\" style=\"width:100%\">\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"mySlides fade\">\r\n");
      out.write("    <img src=\"Capture.jpg\" style=\"width:100%\">\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"mySlides fade\">\r\n");
      out.write("    <img src=\"Capture3.jpg\" style=\"width:100%\">\r\n");
      out.write("  </div>\r\n");
      out.write("<!-- Next and previous buttons -->\r\n");
      out.write("  <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\r\n");
      out.write("  <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<!-- The dots/circles -->\r\n");
      out.write("<div style=\"text-align:center\">\r\n");
      out.write("  <span class=\"dot\" onclick=\"currentSlide(1)\"></span> \r\n");
      out.write("  <span class=\"dot\" onclick=\"currentSlide(2)\"></span> \r\n");
      out.write("  <span class=\"dot\" onclick=\"currentSlide(3)\"></span> \r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("</header>\r\n");
      out.write("<center>\r\n");
      out.write("<h1>Benvenuto su Ordina & Mangia.</h1>\r\n");
      out.write("<h3>Seleziona la tua citt&agrave; per avere il tuo pasto direttamente a casa tua!</h3>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("\r\n");
      out.write("<!-- inizio viola \r\n");
      out.write("\r\n");
      out.write("<center><select onChange='Menu(this)'width=\"800\" height=\"650\"><option value=âjavascript:void(0)â>Scegli la tua cittÃ ...</option><option value='http://localhost:8090/RamoAssicuraz/Servlet1'>Opzione 1</option>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='http://localhost:8090/OrdinaEMangia/ServletCagliari'>Cagliari</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='http://localhost:8090/OrdinaEMangia/ServletAlghero'>Alghero</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='http://localhost:8090/OrdinaEMangia/ServletOristano'>Oristano</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='http://localhost:8090/OrdinaEMangia/ServletNuoro'>Nuoro</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='http://localhost:8090/OrdinaEMangia/ServletOlbia'>Olbia</option></select></center>\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("<sql:setDataSource driver=\"oracle.jdbc.OracleDriver\" url=\"jdbc:oracle:thin:@//ACCENTU-8B056E6:1521/XE\" user=\"CORSO_JAVA\" password=\"admin\" />\r\n");

String sql = "select distinct citta from vetrina";

ConnessioneOrdinaEMangia Connessione = new ConnessioneOrdinaEMangia();

ResultSet rs = Connessione.getResult(sql);


      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3> <center> Scegli la tua citt&aacute </center><h3>\r\n");
      out.write("\r\n");

try 
{
	
      out.write("\r\n");
      out.write("\t<script> function Menu(links) {window.location.href=links[links.selectedIndex].value;}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<center><select onChange='Menu(this)'width=\"800\" height=\"650\"></center>\r\n");
      out.write("\t<option value=\"javascript:void(0)\">Scegli la tua citt&aacute...</option>\t\r\n");
      out.write("\t\r\n");
      out.write("\t");

while (rs.next()) 
{
	String city = rs.getString("citta");	


      out.write("\r\n");
      out.write("\r\n");
      out.write("<option value='http://localhost:8090/OrdinaEMangia/ServletRistoranti?p1=");
      out.print(city);
      out.write("' > ");
      out.print(city );
      out.write("</option>\r\n");
 } 
      out.write("\r\n");
      out.write("</select>\r\n");
 } 

catch (SQLException e) 
{
	e.printStackTrace();
}
Connessione.closeConnection();

      out.write("\r\n");
      out.write("<!-- <footer class=\"footer\"> Ordina & Mangia S.R.L. P.IVA 09876509876 </footer>\r\n");
      out.write(" -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}