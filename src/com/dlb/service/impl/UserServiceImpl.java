package com.dlb.service.impl;

import com.dlb.dao.IUserDao;
import com.dlb.domain.User;
import com.dlb.dao.impl.UserDaoImpl;
import com.dlb.service.IUserService;
public class UserServiceImpl implements IUserService{
	
	private IUserDao userDao = new UserDaoImpl();
	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		if(null != userDao.find(user.getUserName())) {
			System.out.println("用户名已经存在");
		}
	}

	@Override
	public User loginUser(String userName, String passWord) {
		// TODO Auto-generated method stub
		return userDao.find(userName, passWord);
	}
	
}
