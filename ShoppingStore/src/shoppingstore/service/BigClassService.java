package Test5.service;

import java.util.List;

import Test5.entity.BigClass;
import Test5.entity.PegeBean;
import Test5.exception.MyException;

public interface BigClassService {
	public int insertBigClass(BigClass bigclass) throws MyException;//插入书籍大类
	
	public int updateBigClass(String oldbigname,String newbigname) throws MyException;//更新书籍大类名
	
	public List<BigClass> getAllBigClass() throws MyException;//获取所有书籍大类名
	
	public PegeBean<BigClass> getPageBeanBigClass(int pc, int ps) throws MyException;//分页获取书籍大类名
	
	public int CountBigClass() throws MyException;//书籍大类记数
	
	public boolean existBigClass(String bigname) throws MyException;//查看大类是否已有
}
