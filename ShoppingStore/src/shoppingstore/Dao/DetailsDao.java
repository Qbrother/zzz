package Test5.Dao;

import Test5.entity.Details;
import Test5.exception.MyException;

public interface DetailsDao {
	public Details getDetails(String queryname) throws MyException;
	
	
}
