package Test5.Dao;

import java.util.List;

import Test5.entity.Goods;
import Test5.entity.PegeBean;
import Test5.exception.MyException;

public interface GoodsDao {
	public int insertGoods(String bigname,String smallname,String bookname,double price) throws MyException;
	
	public int updateGoods(String bigname,String smallname,String oldbookname,String newbookname) throws MyException;
	
	public List<Goods> getAllGoods() throws MyException;
	
	public PegeBean<Goods> getPageBeanGoods(int pc, int ps) throws MyException;
	
	public int CountGoods() throws MyException;
	
	public boolean existGoods(String bigname,String smallname,String bookname) throws MyException;
}
