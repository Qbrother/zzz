package Test5.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test5.Dao.UserDao;
import Test5.DaoImpl.UserDaoImpl;
import Test5.entity.User;
import Test5.exception.MyException;
import net.sf.json.JSONObject;


public class RegisterUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao=new UserDaoImpl();

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/x-json");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		System.out.println("dopost=="+username);
		JSONObject jb=new JSONObject();
		try {
			boolean flag=userDao.existUser(username);
			if(flag==true) {
				System.out.println(username+"该用户名已存在");
				jb.put(username, "该用户已存在");
			}else {
				System.out.println(username+"该用户名可用");
				jb.put(username, "该用户名可用");
			}
		} catch (MyException e) {
			e.printStackTrace();
		}
		System.out.println(jb.toString());
		out.println(jb);
		out.flush();
		out.close();
	}

}
