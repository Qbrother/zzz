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


public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		String newUserName=request.getParameter("newUserName");
		String newPassword=request.getParameter("newPassword");
		String newPhone=request.getParameter("newPhone");
		HttpSession session=request.getSession();
		int uid=(int) session.getAttribute("Uid");
		String username=(String) session.getAttribute("username");
		String password=(String) session.getAttribute("password");
		String phone=(String) session.getAttribute("phone");
		
//		System.out.println(uid+username+password+phone);
		
//		System.out.println(uid+"++++");
//		System.out.println("~~~~~"+newUserName+newPassword+newPhone);
		if(newUserName==null&&newPassword==null&newPhone==null) {
			response.sendRedirect("MyDangDang_updateUser.jsp");
		}
		
		if(newUserName!=null&&newPassword==null&&newPhone==null) {
			try {
				session.setAttribute("username", newUserName);
				session.setAttribute("password", password);
				session.setAttribute("phone", phone);
				userService.updateUserName(newUserName, uid);
//				System.out.println(password+"++++"+phone);
				request.getRequestDispatcher("MyDangDang_updateUser.jsp").forward(request, response);;
				
			} catch (MyException e) {
				e.printStackTrace();
			}
		}
		
		if(newPassword!=null) {
			try {
				session.setAttribute("username", username);
				session.setAttribute("password", newPassword);
				session.setAttribute("phone", phone);
				userService.updateUserPassword(newPassword, uid);
				request.getRequestDispatcher("MyDangDang_updateUser.jsp").forward(request, response);;
			} catch (MyException e) {
				e.printStackTrace();
			}
		}
		/*
		if(newPhone!=null) {
			try {
				session.setAttribute("phone", newPhone);
				userService.updateUserPhone(newPhone, uid);
			} catch (MyException e) {
				e.printStackTrace();
			}
		}
		
		response.sendRedirect("MyDangDang_updateUser.jsp");*/
	}

}
