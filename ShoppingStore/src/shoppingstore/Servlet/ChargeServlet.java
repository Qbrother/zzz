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
 * Servlet implementation class ChargeServlet
 */
public class ChargeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		int uid=(int) session.getAttribute("Uid");
		double balance=(double) session.getAttribute("balance");
		String charge=request.getParameter("charge");
		boolean result = charge.matches("[0-9]+");//金额为纯数字
		if(result) {
			Double money=Double.parseDouble(charge);
			if(money>=0) {
				balance+=money;
				try {
					userService.updateBalance(balance, uid);
					session.setAttribute("balance", balance);
					response.sendRedirect("MyDangDang_balance.jsp");
				} catch (MyException e) {
					e.printStackTrace();
				}
			}else {
				response.sendRedirect("MyDangDang_balance.jsp");
			}
		}else {
			response.sendRedirect("MyDangDang_balance.jsp");
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}

}
