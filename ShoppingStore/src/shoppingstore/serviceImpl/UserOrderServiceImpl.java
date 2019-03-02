package Test5.serviceImpl;

import java.util.List;

import Test5.Dao.UserOrderDao;
import Test5.DaoImpl.UserOrderDaoImpl;
import Test5.entity.PegeBean;
import Test5.entity.UserOrder;
import Test5.exception.MyException;
import Test5.service.UserOrderService;

public class UserOrderServiceImpl implements UserOrderService {
	private UserOrderDao userOrderDao=new UserOrderDaoImpl();

	@Override
	public int insertUserOrder(UserOrder userOrder) throws MyException {
		// TODO Auto-generated method stub
		return userOrderDao.insertUserOrder(userOrder);
	}

	@Override
	public List<UserOrder> getSingleUserOrder(int uid) throws MyException {
		// TODO Auto-generated method stub
		return userOrderDao.getSingleUserOrder(uid);
	}

	@Override
	public PegeBean<UserOrder> getPageBeanUserOrder(int pc, int ps, int uid) throws MyException {
		// TODO Auto-generated method stub
		return userOrderDao.getPageBeanUserOrder(pc, ps, uid);
	}

	@Override
	public int CountSingleOrder(int uid) throws MyException {
		// TODO Auto-generated method stub
		return userOrderDao.CountSingleOrder(uid);
	}

	@Override
	public PegeBean<UserOrder> getPageBeanAllOrder(int pc, int ps) throws MyException {
		// TODO Auto-generated method stub
		return userOrderDao.getPageBeanAllOrder(pc, ps);
	}

	@Override
	public int CountAllOrder() throws MyException {
		// TODO Auto-generated method stub
		return userOrderDao.CountAllOrder();
	}

}
