package Test5.service;

import java.util.List;

import Test5.entity.ReadyBuy;
import Test5.exception.MyException;

public interface ReadyBuyService {
	//插入要确定购买的订单
	public int insertReadyBuy(String bookName, double dangPrice, int count, double price, int uid) throws MyException;

	public List<ReadyBuy> getSingleReadyBuy(int uid) throws MyException;//得到单人想买的所有商品
}
