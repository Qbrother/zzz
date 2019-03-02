package Test5.serviceImpl;

import java.util.List;

import Test5.Dao.CartDao;
import Test5.DaoImpl.CartDaoImpl;
import Test5.entity.Cart;
import Test5.entity.PegeBean;
import Test5.service.CartService;

public class CartServiceImpl implements CartService {
	private CartDao cartDao=new CartDaoImpl();

	@Override
	public List<Cart> getCartList(int uid) {
		// TODO Auto-generated method stub
		return cartDao.getCartList(uid);
	}

	@Override
	public PegeBean<Cart> getPageBeanCart(int pc, int ps, int uid) {
		// TODO Auto-generated method stub
		return cartDao.getPageBeanCart(pc, ps, uid);
	}

	@Override
	public int CountSingleCart(int uid) {
		// TODO Auto-generated method stub
		return cartDao.CountSingleCart(uid);
	}

	@Override
	public int insertCard(String cover, String bookName, double marketPrice, double dangPrice, double price, int uid) {
		// TODO Auto-generated method stub
		return cartDao.insertCard(cover, bookName, marketPrice, dangPrice, price, uid);
	}

}
