package Test5.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.exception.MyException;
import Test5.service.BigClassService;
import Test5.serviceImpl.BigClassServiceImpl;

/**
 * Servlet implementation class BigClassUpdateServlet
 */
public class BigClassUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BigClassService bigClassService=new BigClassServiceImpl();
       

    public BigClassUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String oldbigname=request.getParameter("oldbigname");
		String newbigname=request.getParameter("newbigname");
//		System.out.println("++"+oldbigname+"--"+newbigname);
		if(oldbigname!=null&&!"".equals(oldbigname)&&newbigname!=null&&!"".equals(newbigname)) {
			try {
				bigClassService.updateBigClass(oldbigname, newbigname);
				request.getRequestDispatcher("bigclass.do").forward(request, response);
			} catch (MyException e) {
				e.printStackTrace();
			}
		}else {
			response.sendRedirect("bigclass.do");
		}
	}
	
}
