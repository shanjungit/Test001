package com.dlb.dao;
import com.dlb.domain.User;
public interface IUserDao {
	/**
	 * 根据用户名和密码查找用户
	 * @param userName
	 * @param password
	 * @return User
	 */
	User find(String userName,String password);
	/**
	 * 添加用户
	 * @param user
	 */
	void add(User user);
	/**
	 * 根据用户名查找用户
	 * @param user
	 * @return
	 */
	User find(String user);
}
