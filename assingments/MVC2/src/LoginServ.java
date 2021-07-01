

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		LoginBean l1=new LoginBean();
		boolean b=l1.validate(uname, pass);
		if(b) {
			System.out.println("login sucess");
			RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
		}
		else {
			System.out.println("login fail");
			RequestDispatcher rs=request.getRequestDispatcher("fail.jsp");
			rs.forward(request, response);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

}
