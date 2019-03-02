package Test5.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Test5.entity.Cart;
import Test5.entity.PegeBean;
import Test5.service.CartService;
import Test5.serviceImpl.CartServiceImpl;

public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CartService cartService=new CartServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		int uid=(int) session.getAttribute("Uid");
//		System.out.println("uid----"+uid);
		List<Cart> cartLists = cartService.getCartList(uid);
//		System.out.println("********"+cartLists);
		
		try {
			int pc=getPc(request,response);
			int ps=5;
			PegeBean<Cart> pageBean=cartService.getPageBeanCart(pc, ps,uid);
			request.setAttribute("pb", pageBean);
			request.getRequestDispatcher("MyDangDang_cart.jsp").forward(request, response);
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
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}

}
