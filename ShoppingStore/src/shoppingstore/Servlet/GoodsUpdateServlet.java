package Test5.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.exception.MyException;
import Test5.service.GoodsService;
import Test5.service.SmallClassService;
import Test5.serviceImpl.GoodsServiceImpl;
import Test5.serviceImpl.SmallClassServiceImpl;


public class GoodsUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GoodsService goodsService=new GoodsServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bigname=request.getParameter("bigname");
		String smallname=request.getParameter("smallname");
		String oldbookname=request.getParameter("oldbookname");
		String newbookname=request.getParameter("newbookname");
		
		if(bigname!=null&&!"".equals(bigname)
				&&smallname!=null&&!"".equals(smallname)
				&&oldbookname!=null&&!"".equals(oldbookname)
				&&newbookname!=null&&!"".equals(newbookname)
				) {
			
			try {
				boolean flag = goodsService.existGoods(bigname, smallname, oldbookname);
				if(flag) {
					goodsService.updateGoods(bigname, smallname, oldbookname, newbookname);
					request.getRequestDispatcher("goods.do").forward(request, response);
				}else {
					response.sendRedirect("goods.do");
				}
			} catch (MyException e) {
				e.printStackTrace();
			}
			
			
		}else {
			response.sendRedirect("goods.do");
		}
		
	}

}
