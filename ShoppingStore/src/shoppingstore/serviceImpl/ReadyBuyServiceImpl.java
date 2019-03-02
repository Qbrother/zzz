package Test5.serviceImpl;

import java.util.List;

import Test5.Dao.ReadyBuyDao;
import Test5.DaoImpl.ReadyBuyDaoImpl;
import Test5.entity.ReadyBuy;
import Test5.exception.MyException;
import Test5.service.ReadyBuyService;

public class ReadyBuyServiceImpl implements ReadyBuyService {
	private ReadyBuyDao readyBuyDao=new ReadyBuyDaoImpl();

	@Override
	public int insertReadyBuy(String bookName, double dangPrice, int count, double price, int uid) throws MyException {
		return readyBuyDao.insertReadyBuy(bookName, dangPrice, count, price, uid);
		
		
	}

	@Override
	public List<ReadyBuy> getSingleReadyBuy(int uid) throws MyException {
		// TODO Auto-generated method stub
		return readyBuyDao.getSingleReadyBuy(uid);
	}

}
