package Test5.service;

import Test5.entity.Details;
import Test5.exception.MyException;

public interface DetailsService {
	public Details getDetails(String queryname) throws MyException;//得到该搜索后的结果
}
