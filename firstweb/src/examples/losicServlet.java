package examples;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jdbc.pool.interceptor.ResetAbandonedTimerMBean;

/**
 * Servlet implementation class losicServlet
 */
@WebServlet("/losic")
public class losicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public losicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Random r = new Random();
		int v1 = (int) r.nextInt(100)+1;
		int v2 = (int) r.nextInt(100)+1;
		int result = v1+ v2 ;
		
		request.setAttribute("v1", v1);
		request.setAttribute("v2", v2);
		request.setAttribute("r", result);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/jspr.jsp");
		rd.forward(request, response);
		
	}

}
