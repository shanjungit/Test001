package com.dlb.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dlb.domain.User;
import com.dlb.service.IUserService;
import com.dlb.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse responese) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		IUserService userService = new UserServiceImpl();
		User userToLogin = userService.loginUser(userName, passWord);
		if(null == userToLogin || !passWord.equals(userToLogin.getPassWord()) ) {
			request.getRequestDispatcher("/UserCanNotLoginError.jsp").forward(request, responese);
		}
		
		if(userToLogin.getUserName().equals(userName) && userToLogin.getPassWord().equals(passWord)) {
			if("Rep".equals(userToLogin.getFunctionProfile())) {
				request.getRequestDispatcher("/Admin.jsp").forward(request, responese);
			} else {
				request.getRequestDispatcher("/manager.jsp").forward(request, responese);
			}
		} else {
			request.getRequestDispatcher("/UserCanNotLoginError.jsp").forward(request, responese);
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	} 
}
