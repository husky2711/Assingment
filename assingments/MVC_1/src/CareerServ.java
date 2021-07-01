

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CareerServ
 */
@WebServlet("/CareerServ")
public class CareerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException
	{
		CareerExpert ce=new CareerExpert();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CareerExpert ce=new CareerExpert();
		String s=request.getParameter("Qual");
		String q=ce.Advice(s);
		request.setAttribute("str", q);
		RequestDispatcher rd=request.getRequestDispatcher("CareerDetails.jsp");
		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
