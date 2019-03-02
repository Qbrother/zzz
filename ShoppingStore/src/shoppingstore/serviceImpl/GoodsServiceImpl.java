package Test5.serviceImpl;

import java.util.List;

import Test5.Dao.GoodsDao;
import Test5.DaoImpl.GoodsDaoImpl;
import Test5.entity.Goods;
import Test5.entity.PegeBean;
import Test5.exception.MyException;
import Test5.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	private GoodsDao goodsDao=new GoodsDaoImpl();

	@Override
	public int insertGoods(String bigname, String smallname, String bookname,double price) throws MyException {
		// TODO Auto-generated method stub
		return goodsDao.insertGoods(bigname, smallname, bookname,price);
	}

	@Override
	public int updateGoods(String bigname, String smallname, String oldbookname, String newbookname)
			throws MyException {
		// TODO Auto-generated method stub
		return goodsDao.updateGoods(bigname, smallname, oldbookname, newbookname);
	}

	@Override
	public List<Goods> getAllGoods() throws MyException {
		// TODO Auto-generated method stub
		return goodsDao.getAllGoods();
	}

	@Override
	public PegeBean<Goods> getPageBeanGoods(int pc, int ps) throws MyException {
		// TODO Auto-generated method stub
		return goodsDao.getPageBeanGoods(pc, ps);
	}

	@Override
	public int CountGoods() throws MyException {
		// TODO Auto-generated method stub
		return goodsDao.CountGoods();
	}

	@Override
	public boolean existGoods(String bigname, String smallname, String bookname) throws MyException {
		// TODO Auto-generated method stub
		return goodsDao.existGoods(bigname, smallname, bookname);
	}

}
