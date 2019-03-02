package Test5.service;

import java.util.List;

import Test5.entity.PegeBean;
import Test5.entity.SmallClass;
import Test5.exception.MyException;

public interface SmallClassService {
	public int insertSmallClass(String bigname,String smallname) throws MyException;//插入小类
	
	public int updateSmallClass(String bigname,String oldsmallname,String newsamllname) throws MyException;//更新小类名
	
	public List<SmallClass> getAllSmallClass() throws MyException;//获取所有小类列表
	
	public PegeBean<SmallClass> getPageBeanSmallClass(int pc, int ps) throws MyException;//获取分页小类列表
	
	public int CountSmallClass() throws MyException;//获取总小类数
	
	public boolean existSmallClass(String bigname,String smallname) throws MyException;//检查该小类是否存在
	
	public List<SmallClass> getSingleSmallClass(String bigname) throws MyException;//获得单个大类的小类列表
}
