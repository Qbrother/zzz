package Test5.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Test5.DButis.OrderNumber;
import Test5.entity.ReadyBuy;
import Test5.entity.User;
import Test5.entity.UserOrder;
import Test5.exception.MyException;
import Test5.service.ReadyBuyService;
import Test5.service.UserOrderService;
import Test5.service.UserService;
import Test5.serviceImpl.ReadyBuyServiceImpl;
import Test5.serviceImpl.UserOrderServiceImpl;
import Test5.serviceImpl.UserServiceImpl;

public class OrderGeneratedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReadyBuyService readyBuyService = new ReadyBuyServiceImpl();
	private UserOrderService userOrderService = new UserOrderServiceImpl();
	private UserService userDaoService = new UserServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");

		String ordertime = OrderNumber.getOrderNumber();
		HttpSession session = request.getSession();
		int uid = (int) (session.getAttribute("Uid"));
		String username = (String) session.getAttribute("username");
		session.setAttribute("ordertime", ordertime);
		String address = request.getParameter("address");

		String uname = request.getParameter("uname");
		String uaddress = request.getParameter("uaddress");
		String uphone = request.getParameter("uphone");
		System.out.println("address+++" + address);
		try {
			List<ReadyBuy> singleReadyBuys = readyBuyService.getSingleReadyBuy(uid);
			if (!"填写新地址".equals(address)) {

				// 余额不足得充值
				String totalPrice = (String) session.getAttribute("totalPrice");
				double money = Double.parseDouble(totalPrice);

				try {
					User user = userDaoService.getUser(username);
					double balance = user.getBalance();
					System.out.println("balance===" + balance);
					if (balance - money >= 0) {
						balance -= money;
						userDaoService.updateBalance(balance, uid);
						for (ReadyBuy singleReadBuy : singleReadyBuys) {
							userOrderService.insertUserOrder(new UserOrder(ordertime, singleReadBuy.getBookName(),
									singleReadBuy.getDangPrice(), singleReadBuy.getCount(), singleReadBuy.getPrice(),
									address, username, "待发送", uid));
						}
						session.setAttribute("balance", balance);
						request.getRequestDispatcher("MyDangDang_ordergenerated.jsp").forward(request, response);
					} else {
						request.getRequestDispatcher("MyDangDang_balance.jsp").forward(request, response);
					}
				} catch (MyException e) {
					e.printStackTrace();
				}

			} else {
				if (uname != null && !"".equals(uname) && uaddress != null && !"".equals(uaddress) && uphone != null
						&& !"".equals(uphone)) {

					// 余额不足得充值
					String totalPrice = (String) session.getAttribute("totalPrice");
					double money = Double.parseDouble(totalPrice);

					try {
						User user = userDaoService.getUser(username);
						double balance = user.getBalance();
						if (balance - money >= 0) {
							balance -= money;
							userDaoService.updateBalance(balance, uid);
							for (ReadyBuy singleReadBuy : singleReadyBuys) {
								userOrderService.insertUserOrder(new UserOrder(ordertime, singleReadBuy.getBookName(),
										singleReadBuy.getDangPrice(), singleReadBuy.getCount(),
										singleReadBuy.getPrice(), uaddress, uname, "待发送", uid));
							}
							session.setAttribute("balance", balance);
							request.getRequestDispatcher("MyDangDang_ordergenerated.jsp").forward(request, response);
						} else {
							request.getRequestDispatcher("MyDangDang_balance.jsp").forward(request, response);
						}
					} catch (MyException e) {
						e.printStackTrace();
					}

				}
				response.sendRedirect("MyDangDang_address.jsp");
			}
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

}
