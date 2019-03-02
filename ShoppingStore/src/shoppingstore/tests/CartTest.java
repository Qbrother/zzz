package Test5.tests;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Test5.Dao.CartDao;
import Test5.DaoImpl.CartDaoImpl;
import Test5.entity.Cart;

public class CartTest {
	private CartDao cartDao;
	
	@Before
	public void CartDaoImpl() {
		cartDao=new CartDaoImpl();
	}
	
	@Test
	public void getcartList(){
		List<Cart> carts = cartDao.getCartList(1);
		System.out.println(carts);
	}
}
