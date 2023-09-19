package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class DBAction {
	public static DBAction instance = new DBAction();
	private Connection conn;
	
	
	public DBAction() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/universe?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","1234");
			System.out.println("데이터 베이스 연결 성공");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static DBAction getInstance() {
		if(instance==null) {
			instance = new DBAction();
		}
		return instance;
	}
	public Connection getConnection() {
		return conn;
	}
	public void close() {
		try {
			if(conn!=null)conn.close();
		}catch(Exception e) {}
	}
	
}
