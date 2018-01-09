package com.dlb.dao;
import com.dlb.domain.User;
public interface IUserDao {
	/**
	 * �����û�������������û�
	 * @param userName
	 * @param password
	 * @return User
	 */
	User find(String userName,String password);
	/**
	 * ����û�
	 * @param user
	 */
	void add(User user);
	/**
	 * �����û��������û�
	 * @param user
	 * @return
	 */
	User find(String user);
}
