package jsptest.serv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsptest.User;

/**
 * Servlet implementation class Jspservlet
 */
@WebServlet("/login.do")
public class Jspservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jspservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setId(request.getParameter("id"));
		user.setPassword("pw");
		request.setAttribute("reusult", user.isOK());
		request.getRequestDispatcher("login.jsp").forward(request,response); // 데이터 추가후 새로고침 시 계속 추가됨 주의
		//response.sendRedirect("login.jsp"); // Refresh 해도 값 전달 안됨. 
	}

}
