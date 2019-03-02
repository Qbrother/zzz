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
 * Servlet implementation class UpdateUserPhoneServlet
 */
public class UpdateUserPhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		String phone=(String) session.getAttribute("phone");
		int uid=(int) session.getAttribute("Uid");
		String newPhone=request.getParameter("newPhone");
//		System.out.println(phone+"++++"+newPhone+"----"+uid);
		if(newPhone!=null&&!"".equals(newPhone)) {
			try {
				userService.updateUserPhone(newPhone, uid);
				request.getRequestDispatcher("person.do").forward(request, response);
			} catch (MyException e) {
				e.printStackTrace();
			}
		}else {
			request.setAttribute("phone", phone);
			request.getRequestDispatcher("person.do").forward(request, response);
		}
	}

}
