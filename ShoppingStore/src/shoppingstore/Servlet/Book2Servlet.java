package Test5.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Test5.service.CartService;
import Test5.serviceImpl.CartServiceImpl;

/**
 * Servlet implementation class Book2Servlet
 */
public class Book2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CartService cartService=new CartServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		int uid=(int) session.getAttribute("Uid");
//		System.out.println("Uid==="+uid);
		String cover="img/25297179-1_l_6.jpg";
		String bookName="《沙海》";
		double marketPrice=69.8;
		double dangPrice=69.8;
		double price=69.8;
		
		cartService.insertCard(cover, bookName, marketPrice, dangPrice, price, uid);
		response.sendRedirect("book_sand.jsp");
	}

}
