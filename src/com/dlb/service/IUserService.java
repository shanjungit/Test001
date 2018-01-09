package com.dlb.service;

import com.dlb.domain.User;

public interface IUserService {
	/**
	 * 提供注册服务
	 * @param user
	 * 
	 */
	void registerUser(User user);
	/**
	 * 提供登录服务
	 * @param userName
	 * @param passWord
	 * @return
	 */
	User loginUser(String userName,String passWord);
	
}
