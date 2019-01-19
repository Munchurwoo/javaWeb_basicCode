package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class nextPage
 */
@WebServlet("/next")
public class nextPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		
		out.println(request.getAttribute("lotto"));
		
		out.println("</body>");
		out.println("</html>");
	}

}
