package Test5.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.entity.Goods;
import Test5.entity.PegeBean;
import Test5.service.GoodsService;
import Test5.serviceImpl.GoodsServiceImpl;

/**
 * Servlet implementation class GoodsServlet
 */
public class GoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GoodsService goodsService=new GoodsServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		
		try {
			int pc=getPc(request,response);
			int ps=5;
			PegeBean<Goods> pageBean=goodsService.getPageBeanGoods(pc, ps);
			request.setAttribute("pb", pageBean);
			request.getRequestDispatcher("manage_goods.jsp").forward(request, response);
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
