package Test5.service;

import java.util.List;

import Test5.entity.Goods;
import Test5.entity.PegeBean;
import Test5.exception.MyException;

public interface GoodsService {
	//商品=书
	public int insertGoods(String bigname,String smallname,String bookname,double price) throws MyException;//插入商品
	
	public int updateGoods(String bigname,String smallname,String oldbookname,String newbookname) throws MyException;//更新商品名
	
	public List<Goods> getAllGoods() throws MyException;//获得所有商品
	
	public PegeBean<Goods> getPageBeanGoods(int pc, int ps) throws MyException;//分页获得商品
	
	public int CountGoods() throws MyException;//商品记数
	
	public boolean existGoods(String bigname,String smallname,String bookname) throws MyException;//是否存在该商品
}
