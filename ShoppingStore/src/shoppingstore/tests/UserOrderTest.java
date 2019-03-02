package Test5.tests;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Test5.DButis.OrderNumber;
import Test5.Dao.UserOrderDao;
import Test5.DaoImpl.UserOrderDaoImpl;
import Test5.entity.UserOrder;
import Test5.exception.MyException;

public class UserOrderTest {
	private UserOrderDao userOrderDao;
	
	@Before
	public void UserOrderDaoImpl() {
		userOrderDao=new UserOrderDaoImpl();
	}
	@Test
	public void insertUserorder() throws MyException {
		int num = userOrderDao.insertUserOrder
				(new UserOrder(OrderNumber.getOrderNumber(),"《养育男孩》",28.8,1,2.8,"翡翠城","rose","交易成功",2));
		System.out.println("订单插入测试:"+num);
	}
	
	@Test
	public void getsingleUserOrder() throws MyException {
		List<UserOrder> singlelists = userOrderDao.getSingleUserOrder(1);
		System.out.println("获得订单表测试:"+singlelists);
	}
}
