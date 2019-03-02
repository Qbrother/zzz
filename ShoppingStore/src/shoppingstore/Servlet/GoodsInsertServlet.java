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


public class GoodsInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GoodsService goodsService=new GoodsServiceImpl();
	private SmallClassService smallClassService=new SmallClassServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		
		String bigname=request.getParameter("bigname");
		String smallname=request.getParameter("smallname");
		String newbookname=request.getParameter("newbookname");
		double bookprice=Float.parseFloat(request.getParameter("bookprice"));
		
//		System.out.println(bigname+"++"+smallname+"++"+newbookname+"++"+bookprice+"++");
		if(bigname!=null&&!"".equals(bigname)
				&&smallname!=null&&!"".equals(smallname)
				&&newbookname!=null&&!"".equals(newbookname)
				) {
			
			try {
				boolean flag = smallClassService.existSmallClass(bigname, smallname);
				if(flag) {
					goodsService.insertGoods(bigname, smallname, newbookname,bookprice);
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
