package examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.env.ISourceMethod;

/**
 * Servlet implementation class frontServlet
 */
@WebServlet("/front")
public class frontServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public frontServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Random r = new Random();
		Set<Integer> lotto = new HashSet<Integer>();
		while (true) {
			lotto.add(r.nextInt(45) + 1);
			if (lotto.size() > 5) {
				break;
			}			
		}
		System.out.println(lotto);
		req.setAttribute("lotto", lotto);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/next");
		requestDispatcher.forward(req, resp);
		
		

	}
}
