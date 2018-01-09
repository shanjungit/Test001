package com.dlb.service;

import com.dlb.domain.User;

public interface IUserService {
	/**
	 * Provide register user service
	 * @param user
	 * 
	 */
	void registerUser(User user);
	/**
	 * Provided login service
	 * @param userName
	 * @param passWord
	 * @return
	 */
	User loginUser(String userName,String passWord);
	
}
