package Test5.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.exception.MyException;
import Test5.service.SmallClassService;
import Test5.serviceImpl.SmallClassServiceImpl;


public class SmallClassUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SmallClassService smallClassService=new SmallClassServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String bigname=request.getParameter("bigname");
		String oldsmallname=request.getParameter("oldsmallname");
		String newsmallname=request.getParameter("newsmallname");
		
//		System.out.println(bigname+"+"+oldsmallname+"+"+newsmallname);
		if(bigname!=null&&!"".equals(bigname)&&oldsmallname!=null&&!"".equals(oldsmallname)&&newsmallname!=null&&!"".equals(newsmallname)) {
			try {
				boolean flag=smallClassService.existSmallClass(bigname, oldsmallname);
				if(flag) {
					smallClassService.updateSmallClass(bigname, oldsmallname, newsmallname);
					request.getRequestDispatcher("smallclass.do").forward(request, response);
				}else {
					response.sendRedirect("smallclass.do");
				}
			} catch (MyException e) {
				e.printStackTrace();
			}
		}else {
			response.sendRedirect("smallclass.do");
		}
	}

}
