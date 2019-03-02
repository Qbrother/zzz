package Test5.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Test5.exception.MyException;
import Test5.service.ReadyBuyService;
import Test5.serviceImpl.ReadyBuyServiceImpl;

/**
 * Servlet implementation class CartBuyServlet
 */
public class CartBuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReadyBuyService readyBuyService=new ReadyBuyServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		
		int uid=(int)(session.getAttribute("Uid"));
//		System.out.println("uid++++"+uid);
		String bookName=request.getParameter("bookName");
		String dangPrice=request.getParameter("dangPrice");
		String count=request.getParameter("count");
		String price=request.getParameter("price");
		String allPrice=request.getParameter("allPrice");
		
		
		/*System.out.println("bookName==="+bookName);
		System.out.println("dangPrice==="+dangPrice);
		System.out.println("count==="+count);
		System.out.println("price==="+price);
		System.out.println("allPrice==="+allPrice);*/
		
		if(bookName!=null&&!"".equals(bookName)) {
			String bookNames[]=bookName.split(",");
			String dangPrices[]=dangPrice.split(",");
			String counts[]=count.split(",");
			String prices[]=price.split(",");
			
			session.setAttribute("num", bookNames.length);
			session.setAttribute("totalPrice", allPrice);
			for(int i=0;i<bookNames.length;i++) {
				try {
					double dangPricess=Double.parseDouble(dangPrices[i]);
					int countss=Integer.parseInt(counts[i]);
					double pricess=Double.parseDouble(prices[i]);
					readyBuyService.insertReadyBuy(bookNames[i],dangPricess, countss, pricess, uid);
				} catch (MyException e) {
					e.printStackTrace();
				}
			}
			request.getRequestDispatcher("readybuy.do").forward(request, response);
		}else {
			response.sendRedirect("readybuy.do");
		}
		
		
		
	}

}
