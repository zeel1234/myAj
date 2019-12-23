import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Header extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
  {

	  ServletConfig conf = getServletConfig();
	  response.setContentType("text/html");
	  PrintWriter out = response.getWriter();
	  String title = "Using GET Method to Read Form Data";
      String name = conf.getInitParameter("colorname");
      out.println("<body style='background-color : "+name +"'><h1><font color = 'red'>"+title+"</h1></body>");
  }


}