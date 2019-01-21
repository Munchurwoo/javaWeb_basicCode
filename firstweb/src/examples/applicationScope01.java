package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class applicationScope01
 */
@WebServlet("/applicationScope01")
public class applicationScope01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public applicationScope01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();
		ServletContext application =  getServletContext();
		int value= 1;
		application.setAttribute("value", value);
		out.print("<html>");
		out.println("<head>");
		out.println("<title>apllication</title>");
		out.println("</head>");
		out.println("<body>");
		out.print("<h1>"+value+"</h1>");
		out.println("<form action='applicationScope02'>"
				+ "<input type='submit' value='전송'></form>");
		out.println("</body>");
		out.print("</html>");
		
	}

}
