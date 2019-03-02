package Test5.Dao;

import java.util.List;

import Test5.entity.PegeBean;
import Test5.entity.SmallClass;
import Test5.exception.MyException;

public interface SmallClassDao {
	public int insertSmallClass(String bigname,String smallname) throws MyException;
	
	public int updateSmallClass(String bigname,String oldsmallname,String newsamllname) throws MyException;
	
	public List<SmallClass> getAllSmallClass() throws MyException;
	
	public List<SmallClass> getSingleSmallClass(String bigname) throws MyException;
	
	public PegeBean<SmallClass> getPageBeanSmallClass(int pc, int ps) throws MyException;
	
	public int CountSmallClass() throws MyException;
	
	public boolean existSmallClass(String bigname,String smallname) throws MyException;
}
