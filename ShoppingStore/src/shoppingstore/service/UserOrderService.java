package Test5.service;

import java.util.List;

import Test5.entity.PegeBean;
import Test5.entity.UserOrder;
import Test5.exception.MyException;

public interface UserOrderService {
	public int insertUserOrder(UserOrder userOrder) throws MyException;//插入订单
	
	public List<UserOrder> getSingleUserOrder(int uid) throws MyException;//获取单人订单
	
	PegeBean<UserOrder> getPageBeanUserOrder(int pc, int ps, int uid) throws MyException;//获得该用户订单页面
	
	public int CountSingleOrder(int uid) throws MyException;//该用户总共有多少订单
	
	public PegeBean<UserOrder> getPageBeanAllOrder(int pc, int ps) throws MyException;//获得所有订单
	
	public int CountAllOrder() throws MyException;//所有订单数
}
