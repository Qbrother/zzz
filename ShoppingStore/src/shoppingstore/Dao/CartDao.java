package Test5.Dao;

import java.util.List;


import Test5.entity.Cart;
import Test5.entity.PegeBean;

public interface CartDao {
	public List<Cart> getCartList(int uid);
	
	public PegeBean<Cart> getPageBeanCart(int pc, int ps, int uid);
	
	public int CountSingleCart(int uid);

	public int insertCard(String cover,String bookName,double marketPrice,double dangPrice,double price,int uid);
}





