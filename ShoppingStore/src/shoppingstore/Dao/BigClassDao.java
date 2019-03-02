package Test5.Dao;

import java.util.List;

import Test5.entity.BigClass;
import Test5.entity.PegeBean;
import Test5.exception.MyException;

public interface BigClassDao {
	public int insertBigClass(BigClass bigclass) throws MyException;
	
	public int updateBigClass(String oldbigname,String newbigname) throws MyException;
	
	public List<BigClass> getAllBigClass() throws MyException;
	
	public PegeBean<BigClass> getPageBeanBigClass(int pc, int ps) throws MyException;
	
	public int CountBigClass() throws MyException;
	
	public boolean existBigClass(String bigname) throws MyException;
	
}
