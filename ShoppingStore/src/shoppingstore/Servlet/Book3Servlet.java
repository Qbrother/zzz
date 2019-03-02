package Test5.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Test5.service.CartService;
import Test5.serviceImpl.CartServiceImpl;


public class Book3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CartService cartService=new CartServiceImpl();

    public Book3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		int uid=(int) session.getAttribute("Uid");
//		System.out.println("Uid==="+uid);
		String cover="img/中国古典文学四大名著.jpg";
		String bookName="《中国古典文学四大名著》";
		double marketPrice=97;
		double dangPrice=86.3;
		double price=86.3;
		
		cartService.insertCard(cover, bookName, marketPrice, dangPrice, price, uid);
		response.sendRedirect("book_ChineseClassicalLiterature.jsp");
	}



}
