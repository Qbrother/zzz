package Test5.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.entity.PegeBean;
import Test5.entity.SmallClass;
import Test5.service.SmallClassService;
import Test5.serviceImpl.SmallClassServiceImpl;

/**
 * Servlet implementation class SmallClassServlet
 */
public class SmallClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SmallClassService smallClassService=new SmallClassServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		
		try {
			int pc=getPc(request,response);
			int ps=5;
			PegeBean<SmallClass> pageBean=smallClassService.getPageBeanSmallClass(pc, ps);
			request.setAttribute("pb", pageBean);
			request.getRequestDispatcher("manage_smallclass.jsp").forward(request, response);
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
