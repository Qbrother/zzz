package Test5.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.entity.Details;
import Test5.exception.MyException;
import Test5.service.DetailsService;
import Test5.serviceImpl.DetailsServiceImpl;


public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DetailsService detailsService=new DetailsServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		String querybook=request.getParameter("querybook");
//		System.out.println(querybook);
		
		if(querybook!=null&&!"".equals(querybook)) {
			try {
				Details details = detailsService.getDetails(querybook);
				if(details!=null) {
					String detailsAddress=details.getDetailsAddress();
					System.out.println(detailsAddress);
					response.sendRedirect(detailsAddress);
				}else {
					response.sendRedirect("MyHome.jsp");
				}
				
			} catch (MyException e) {
				e.printStackTrace();
			}
		}else {
			response.sendRedirect("MyHome.jsp");
		}
	}

}
