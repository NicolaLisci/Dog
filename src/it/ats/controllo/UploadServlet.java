package it.ats.controllo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileUploadException;


/**
 * Servlet implementation class UploadServlet
 */
//@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
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
	
		 boolean isMultipart = ServletFileUpload.isMultipartContent(request);

	        if (isMultipart) {
	            FileItemFactory factory = new DiskFileItemFactory();
	            ServletFileUpload upload = new ServletFileUpload(factory);

	            try {
	            	//List items = upload.parseRequest(request);
	            	List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(new ServletRequestContext(request));
	                Iterator iterator = items.iterator();
	                while (iterator.hasNext()) {
	                    FileItem item = (FileItem) iterator.next();

	                    if (!item.isFormField()) {
	                        String fileName = item.getName();

	                        System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));
	                        String root = "/Users/nicolalisci/eclipse-workspace/Woof3/WebContent";
	                     
	                        System.out.println("url: "+root);
	                        //String root = "http://localhost:8081/Woof3/WebContent";
	                        System.out.println("root:"+root);
	                        File path = new File(root + "/uploads");
	                        if (!path.exists()) {
	                            boolean status = path.mkdirs();
	                        }

	                        File uploadedFile = new File(path + "/" + fileName);
	                        System.out.println(uploadedFile.getAbsolutePath());
	                        item.write(uploadedFile);
	                    }
	                }
	            } catch (FileUploadException e) {
	                e.printStackTrace();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        
	    	RequestDispatcher requestDispatcher = request.getRequestDispatcher("modificaUtente.jsp");
			requestDispatcher.forward(request, response);
	    }

}
