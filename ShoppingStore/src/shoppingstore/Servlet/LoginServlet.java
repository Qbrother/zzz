package Test5.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Test5.entity.User;
import Test5.exception.MyException;
import Test5.service.UserService;
import Test5.serviceImpl.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("psd");
		String rememberPsd = request.getParameter("rememberPsd");

		
		// 进入后台
		if ("admin".equals(username) && "admin".equals(password)) {
			response.sendRedirect("manage_rank.jsp");
		}else {
			try {
				boolean flag = userService.isRightUser(username, password);
				if (flag == true) {
					HttpSession session = request.getSession();
					session.setAttribute("username", username);
					if ("yes".equals(rememberPsd)) {
						session.setAttribute("password", password);
						session.setMaxInactiveInterval(60 * 30);// 记住密码只保留30分钟
						request.getRequestDispatcher("MyHome.jsp").forward(request, response);
					} else {
						request.getRequestDispatcher("MyHome.jsp").forward(request, response);
					}
				}
			} catch (MyException e) {
				e.printStackTrace();
			}
		}
		


		if (!"admin".equals(username)) {
			try {
				boolean istrue = userService.isRightUser(username, password);
				if (istrue) {
					User user = userService.getUser(username);
					HttpSession session = request.getSession();

					session.setAttribute("phone", user.getPhone());
					session.setAttribute("Uid", user.getUid());
					session.setAttribute("balance", user.getBalance());
					session.setAttribute("username", user.getUsername());
					if ("yes".equals(rememberPsd)) {
						session.setAttribute("password", user.getPassword());
						request.getRequestDispatcher("MyHome.jsp").forward(request, response);
					} else {
						request.getRequestDispatcher("MyHome.jsp").forward(request, response);
					}
				} else {
					response.sendRedirect("login.jsp");
				}

			} catch (MyException e) {
				e.printStackTrace();
			}
		}

	}
}
