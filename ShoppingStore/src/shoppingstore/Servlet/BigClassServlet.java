package Test5.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.entity.BigClass;
import Test5.entity.PegeBean;
import Test5.service.BigClassService;
import Test5.serviceImpl.BigClassServiceImpl;

public class BigClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BigClassService bigClassService=new BigClassServiceImpl();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		
		try {
			int pc=getPc(request,response);
			int ps=5;
			PegeBean<BigClass> pageBean=bigClassService.getPageBeanBigClass(pc, ps);
			request.setAttribute("pb", pageBean);
			request.getRequestDispatcher("manage_bigclass.jsp").forward(request, response);
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
