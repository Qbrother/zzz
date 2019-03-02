package Test5.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.entity.BigClass;
import Test5.exception.MyException;
import Test5.service.BigClassService;
import Test5.serviceImpl.BigClassServiceImpl;

/**
 * Servlet implementation class BigClassInsertServlet
 */
public class BigClassInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BigClassService bigClassService=new BigClassServiceImpl();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String newBigClass=request.getParameter("newbigclass");
//		System.out.println(newBigClass);
		
		if(newBigClass!=null&&!"".equals(newBigClass)) {
			boolean flag;
			try {
				flag = bigClassService.existBigClass(newBigClass);
				if(flag) {
					response.sendRedirect("bigclass.do");	
				}else {
					try {
						bigClassService.insertBigClass(new BigClass(newBigClass));
						request.getRequestDispatcher("bigclass.do").forward(request, response);
					} catch (MyException e) {
						e.printStackTrace();
					}
				}
			} catch (MyException e1) {
				e1.printStackTrace();
			}
		}else {
			response.sendRedirect("bigclass.do");	
		}
	}

}
