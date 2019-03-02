package Test5.serviceImpl;

import java.util.List;

import Test5.Dao.SmallClassDao;
import Test5.DaoImpl.SmallClassDaoImpl;
import Test5.entity.PegeBean;
import Test5.entity.SmallClass;
import Test5.exception.MyException;
import Test5.service.SmallClassService;

public class SmallClassServiceImpl implements SmallClassService {
	private SmallClassDao smallClassDao=new SmallClassDaoImpl();

	@Override
	public int insertSmallClass(String bigname, String smallname) throws MyException {
		// TODO Auto-generated method stub
		return smallClassDao.insertSmallClass(bigname, smallname);
	}

	@Override
	public int updateSmallClass(String bigname, String oldsmallname, String newsamllname) throws MyException {
		// TODO Auto-generated method stub
		return smallClassDao.updateSmallClass(bigname, oldsmallname, newsamllname);
	}

	@Override
	public List<SmallClass> getAllSmallClass() throws MyException {
		// TODO Auto-generated method stub
		return smallClassDao.getAllSmallClass();
	}

	@Override
	public PegeBean<SmallClass> getPageBeanSmallClass(int pc, int ps) throws MyException {
		// TODO Auto-generated method stub
		return smallClassDao.getPageBeanSmallClass(pc, ps);
	}

	@Override
	public int CountSmallClass() throws MyException {
		// TODO Auto-generated method stub
		return smallClassDao.CountSmallClass();
	}

	@Override
	public boolean existSmallClass(String bigname, String smallname) throws MyException {
		// TODO Auto-generated method stub
		return smallClassDao.existSmallClass(bigname, smallname);
	}

	@Override
	public List<SmallClass> getSingleSmallClass(String bigname) throws MyException {
		// TODO Auto-generated method stub
		return smallClassDao.getAllSmallClass();
	}

}
