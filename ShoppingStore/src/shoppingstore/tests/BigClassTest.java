package Test5.tests;

import org.junit.Before;
import org.junit.Test;

import Test5.Dao.BigClassDao;
import Test5.DaoImpl.BigClassDaoImpl;
import Test5.entity.BigClass;
import Test5.exception.MyException;

public class BigClassTest {
	private BigClassDao bigClass;
	
	@Before
	public void bigClassDaoImpl() {
		bigClass=new BigClassDaoImpl();
	}
	
	@Test
	public void insertBigClass() throws MyException {
		int num = bigClass.insertBigClass(new BigClass("童书"));
		System.out.println("大类测试:"+num);
	}
	
	@Test
	public void updateBigClass() throws MyException {
		int num = bigClass.updateBigClass("小说", "小说1111");
		System.out.println("大类修改测试:"+num);
	}
}
