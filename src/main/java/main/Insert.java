package main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserinfoDao;
import dto.Userinfo;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
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
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String _id = request.getParameter("loginId");
		String _pw = request.getParameter("loginPw");
		String _name = request.getParameter("name");
		String _nickname = request.getParameter("nickname");
		String _email = request.getParameter("email");
		String _cellphoneNo = request.getParameter("cellphoneNo");
		Userinfo userinfo = new Userinfo().setId(_id).setPwd(_pw).setName(_name).setNickname(_nickname).setEmail(_email).setPhonenumber(_cellphoneNo);
		UserinfoDao userinfoDao = new UserinfoDao();
		userinfoDao.insert(userinfo);
		response.sendRedirect("/universe/jsp/joinsuccess.jsp");
	}

}
