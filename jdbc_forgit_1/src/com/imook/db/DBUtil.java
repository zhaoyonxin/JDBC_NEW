package com.imook.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	
	private static final String URL="jdbc:mysql://127.0.0.1:3306/itxiuzhenyuan";
	private static final String USER="root";
	private static final String PASSWORD="abcd37263";
	
	private static Connection conn=null;

	static {

		try {
			//������������
			Class.forName("com.mysql.jdbc.Driver");
			//��ȡ���ݿ������
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static Connection getConnection(){
		return conn;
	}
}
