package Test5.service;

import java.util.List;

import Test5.entity.Cart;
import Test5.entity.PegeBean;

public interface CartService {
	public List<Cart> getCartList(int uid);//获得单个人当前的购物车列表
	
	PegeBean<Cart> getPageBeanCart(int pc, int ps, int uid);//获得当前用户购物车分页列表
	
	public int CountSingleCart(int uid);//获得当前用户商品类型数量
	
	public int insertCard(String cover,String bookName,double marketPrice,double dangPrice,double price,int uid);//插入数据到购物车
}
