package com.dlb.service;

import com.dlb.domain.User;

public interface IUserService {
	/**
	 * �ṩע�����
	 * @param user
	 * 
	 */
	void registerUser(User user);
	/**
	 * �ṩ��¼����
	 * @param userName
	 * @param passWord
	 * @return
	 */
	User loginUser(String userName,String passWord);
	
}
