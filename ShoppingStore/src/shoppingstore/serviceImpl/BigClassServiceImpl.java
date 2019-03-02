package Test5.serviceImpl;

import java.util.List;

import Test5.Dao.BigClassDao;
import Test5.DaoImpl.BigClassDaoImpl;
import Test5.entity.BigClass;
import Test5.entity.PegeBean;
import Test5.exception.MyException;
import Test5.service.BigClassService;

public class BigClassServiceImpl implements BigClassService {
	private BigClassDao bigClassDao=new BigClassDaoImpl();

	@Override
	public int insertBigClass(BigClass bigclass) throws MyException {
		// TODO Auto-generated method stub
		return bigClassDao.insertBigClass(bigclass);
	}

	@Override
	public int updateBigClass(String oldbigname,String newbigname) throws MyException {
		// TODO Auto-generated method stub
		return bigClassDao.updateBigClass(oldbigname, newbigname);
	}

	@Override
	public List<BigClass> getAllBigClass() throws MyException {
		// TODO Auto-generated method stub
		return bigClassDao.getAllBigClass();
	}

	@Override
	public PegeBean<BigClass> getPageBeanBigClass(int pc, int ps) throws MyException {
		// TODO Auto-generated method stub
		return bigClassDao.getPageBeanBigClass(pc, ps);
	}

	@Override
	public int CountBigClass() throws MyException {
		// TODO Auto-generated method stub
		return bigClassDao.CountBigClass();
	}

	@Override
	public boolean existBigClass(String bigname) throws MyException {
		// TODO Auto-generated method stub
		return bigClassDao.existBigClass(bigname);
	}

}
