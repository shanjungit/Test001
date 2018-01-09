package com.dlb.dao.impl;
import com.dlb.Connect.ConnectionHelper;
import com.dlb.dao.IUserDao;
import com.dlb.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.dom4j.Document;
public class UserDaoImpl implements IUserDao {

	@Override
	public User find(String userName, String password) {
		System.out.println("进入User Find 函数");
		String sql = "select UserName,pass_Word__c, function_Profile__c from User_Info__c "
				+ "where UserName = ?";
		User u = new User();
		String userNameToCheck = null;
		String passWordToCheck = null;
		String functionProfile = null;
		ConnectionHelper ch = new ConnectionHelper();
		Connection conn = ch.getConnection();
		PreparedStatement pt = null;
		ResultSet rs = null;
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, userName);
			
			rs = pt.executeQuery();
			
			while(rs.next()) {
				userNameToCheck = rs.getString("UserName");
				passWordToCheck = rs.getString("pass_Word__c");
			    functionProfile = rs.getString("function_Profile__c");
			}
			if(rs != null) {
				ResultSetMetaData rsmd = rs.getMetaData();
				System.out.println(rsmd.toString());
			}
			System.out.println("查询完成！！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("创建Statement失败");
		}
		u.setUserName(userNameToCheck);
		u.setFunctionProfile(functionProfile);
		u.setPassWord(passWordToCheck);
		ch.close(rs, pt, conn);
		return u;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User find(String user) {
		// TODO Auto-generated method stub
		return null;
	}

}
