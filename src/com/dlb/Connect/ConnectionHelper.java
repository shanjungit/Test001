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
		System.out.println("��ʼ�������ݿ⡣������");
		try {
			conn = DriverManager.getConnection(URL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("�������ݿ�ʧ�ܣ�");
			return conn;
		}
		System.out.println("�������ݿ�ɹ�");
		return conn;
	}
	

	
	public void close(ResultSet rs, PreparedStatement ps, Connection conn) {
		if(null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("�ر�Result Set ʧ��");
			}
			rs = null;
			System.out.println("�ر�Result Set �ɹ�");
		}
		if(null != ps) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("�ر�StateMentʧ��");
				
			}
			ps = null;
			System.out.println("�ر�PrepareStateMent�ɹ�");
		}
		if(null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("�ر�Connectionʧ��");
				return;
			}
			conn = null;
			System.out.println("�ر�Connection�ɹ�");
		}
	}
	
}
