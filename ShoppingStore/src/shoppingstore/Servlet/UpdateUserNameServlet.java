package Test5.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Test5.exception.MyException;
import Test5.service.UserService;
import Test5.serviceImpl.UserServiceImpl;

/**
 * Servlet implementation class UpdateUserNameServlet
 */
public class UpdateUserNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("utf-8");
				HttpSession session=request.getSession();
				String username=(String) session.getAttribute("username");
				int uid=(int) session.getAttribute("Uid");
				String newUserName=request.getParameter("newUserName");
				System.out.println(username+"++++"+newUserName+"----"+uid);
				if(newUserName!=null&&!"".equals(newUserName)) {
					try {
						userService.updateUserName(newUserName, uid);
						session.setAttribute("username", newUserName);
						request.getRequestDispatcher("person.do").forward(request, response);
					} catch (MyException e) {
						e.printStackTrace();
					}
				}else {
					session.setAttribute("username", username);
					request.getRequestDispatcher("person.do").forward(request, response);
				}
	}

}
