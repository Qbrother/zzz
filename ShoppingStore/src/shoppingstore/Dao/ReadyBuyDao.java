package Test5.Dao;

import java.util.List;

import Test5.entity.ReadyBuy;
import Test5.exception.MyException;

public interface ReadyBuyDao {
	public int insertReadyBuy(String bookName, double dangPrice, int count, double price, int uid) throws MyException;

	public List<ReadyBuy> getSingleReadyBuy(int uid) throws MyException;
}
	