package Test5.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.entity.PegeBean;
import Test5.entity.UserOrder;
import Test5.service.UserOrderService;
import Test5.serviceImpl.UserOrderServiceImpl;

public class ManageOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserOrderService userOrderService=new UserOrderServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		//看是否获取到所有用户信息

		try {
			int pc=getPc(request,response);
			int ps=8;
			PegeBean<UserOrder> pageBean=userOrderService.getPageBeanAllOrder(pc, ps);
			request.setAttribute("pb", pageBean);
			request.getRequestDispatcher("manage_order.jsp").forward(request, response);
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
