package Test5.Dao;

import java.util.List;

import Test5.entity.PegeBean;
import Test5.entity.UserOrder;
import Test5.exception.MyException;

public interface UserOrderDao {
	public int insertUserOrder(UserOrder userOrder) throws MyException;
	
	public List<UserOrder> getSingleUserOrder(int uid) throws MyException;
	
	public PegeBean<UserOrder> getPageBeanUserOrder(int pc, int ps, int uid) throws MyException;//获得单人订单
	
	public int CountSingleOrder(int uid) throws MyException;
	
	public PegeBean<UserOrder> getPageBeanAllOrder(int pc, int ps) throws MyException;//获得所有订单
	
	public int CountAllOrder() throws MyException;
	
	
}
