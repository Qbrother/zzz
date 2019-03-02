package Test5.DButis;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderNumber {
	public static String getOrderNumber() {
		String ordernumber="";
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
		String temp = sf.format(new Date());
		int random=(int) (Math.random()*10000);

		ordernumber=temp+random;

		return ordernumber;
	}
}
