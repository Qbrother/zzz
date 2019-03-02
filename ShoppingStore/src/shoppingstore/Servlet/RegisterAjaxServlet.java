package Test5.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterAjaxServlet
 */
public class RegisterAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("username");
		System.out.println("doget=="+userName);
		String resname=null;
		if("jack".equals(userName)){
			resname=userName+" 已存在";
		}else{
			resname=userName+" 可用";
		}
		out.println(resname);
		out.flush();
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
