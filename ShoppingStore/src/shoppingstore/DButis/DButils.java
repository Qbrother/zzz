package Test5.DButis;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DButils {
	private static String driver;
	private static String username;
	private static String password;
	private static String url;
	private static Properties prop;
	
	static {
		prop=new Properties();
		try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
			driver=prop.getProperty("driver");
			username=prop.getProperty("username");
			password=prop.getProperty("password");
			url=prop.getProperty("url");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() {
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url, username, password);
//			System.out.println(conn+"已连接");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		getConn();
	}
}
