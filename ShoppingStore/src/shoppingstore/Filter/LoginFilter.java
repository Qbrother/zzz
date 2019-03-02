package Test5.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		 System.out.println("######");
		 HttpServletRequest req=(HttpServletRequest)request;
	     HttpServletResponse resp=(HttpServletResponse)response;
	     String	username=req.getParameter("username");
	     String	password=req.getParameter("psd");
//	     System.out.println("username==="+username+"----"+password);
	     if(username!=null&&!"".equals(username)&&password!=null&&!"".equals(password)) {
	    	 chain.doFilter(req, resp);
	     }else {
	    	 resp.sendRedirect("login.jsp");
	     }
	     
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
