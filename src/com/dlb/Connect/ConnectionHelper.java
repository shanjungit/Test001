package com.dlb.Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.microsoft.sqlserver.jdbc.*;
public class ConnectionHelper {
	public static final String URL = "jdbc:sqlserver://localhost;integratedSecurity=true;Database=TestDBLSJ";
	public static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection conn = null;
		System.out.println("开始链接数据库。。。。");
		try {
			conn = DriverManager.getConnection(URL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("连接数据库失败！");
			return conn;
		}
		System.out.println("连接数据库成功");
		return conn;
	}
	

	
	public void close(ResultSet rs, PreparedStatement ps, Connection conn) {
		if(null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("关闭Result Set 失败");
			}
			rs = null;
			System.out.println("关闭Result Set 成功");
		}
		if(null != ps) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("关闭StateMent失败");
				
			}
			ps = null;
			System.out.println("关闭PrepareStateMent成功");
		}
		if(null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("关闭Connection失败");
				return;
			}
			conn = null;
			System.out.println("关闭Connection成功");
		}
	}
	
}
