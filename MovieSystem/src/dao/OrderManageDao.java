package dao;

import java.util.List;

import entity.OrderManage;

public interface OrderManageDao {
	void insertBuyOrder(OrderManage order);
	
	void insertOrder(OrderManage order);
	
	List<OrderManage> getOrder();
	
}
