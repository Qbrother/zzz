package Test5.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.entity.User;
import Test5.exception.MyException;
import Test5.service.UserService;
import Test5.serviceImpl.UserServiceImpl;



public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/x-json");
		
		String username=request.getParameter("username");
		String password=request.getParameter("psd2");
		String phone=request.getParameter("phone");
		String check=request.getParameter("check");
//		System.out.println("***"+username+password+phone+check);
		if(username!=null&&password!=null&&phone!=null) {
			if("ok".equals(check)) {
				try {
					userService.insertUser(new User(username,password,phone));
					response.sendRedirect("login.jsp");
				} catch (MyException e) {
					e.printStackTrace();
				}
				
			}
		}
	}

}
