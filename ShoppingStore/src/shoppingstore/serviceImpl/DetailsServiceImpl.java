package Test5.serviceImpl;

import Test5.Dao.DetailsDao;
import Test5.DaoImpl.DetailsDaoImpl;
import Test5.entity.Details;
import Test5.exception.MyException;
import Test5.service.DetailsService;

public class DetailsServiceImpl implements DetailsService {
	private DetailsDao detailsDao=new DetailsDaoImpl();

	@Override
	public Details getDetails(String queryname) throws MyException {
		// TODO Auto-generated method stub
		return detailsDao.getDetails(queryname);
	}

}
