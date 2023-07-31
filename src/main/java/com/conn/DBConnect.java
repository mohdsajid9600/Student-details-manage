package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static Connection conn;

	public static Connection MakeCon() {
			conn=null;
		try {
			if (conn == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");

				String url = "jdbc:mysql://localhost:3306/students_db";
				String username = "root";
				String password = "*******";
				conn = DriverManager.getConnection(url, username, password);
			} else {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}
