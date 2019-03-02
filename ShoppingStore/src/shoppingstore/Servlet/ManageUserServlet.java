package Test5.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.entity.PegeBean;
import Test5.entity.User;
import Test5.exception.MyException;
import Test5.service.UserService;
import Test5.serviceImpl.UserServiceImpl;

/**
 * Servlet implementation class ManageUserServlet
 */
public class ManageUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		//看是否获取到所有用户信息
		try {
			List<User> allusers = userService.getAllUser();
//			System.out.println("++++"+allusers);
		} catch (MyException e) {
			e.printStackTrace();
		}

		try {
			int pc=getPc(request,response);
			int ps=8;
			PegeBean<User> pageBean=userService.getPageBeanUser(pc, ps);
			request.setAttribute("pb", pageBean);
			request.getRequestDispatcher("manage_user.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private int getPc(HttpServletRequest request, HttpServletResponse response) {
		String pc=request.getParameter("pc");
		if(pc==null||pc.trim().isEmpty()) {
			return 1;
		}
		return Integer.parseInt(pc);
	}

}
