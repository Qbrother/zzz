package Test5.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Test5.entity.ReadyBuy;
import Test5.exception.MyException;
import Test5.service.ReadyBuyService;
import Test5.serviceImpl.ReadyBuyServiceImpl;

/**
 * Servlet implementation class ReadyBuyServlet
 */
public class ReadyBuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReadyBuyService readyBuyService=new ReadyBuyServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		int uid=(int)(session.getAttribute("Uid"));
		try {
			List<ReadyBuy> singleReadyBuys = readyBuyService.getSingleReadyBuy(uid);
			request.setAttribute("singleReadyBuys", singleReadyBuys);
			request.getRequestDispatcher("MyDangDang_sureorder.jsp").forward(request, response);
		} catch (MyException e) {
			e.printStackTrace();
		}
		
	}

}
