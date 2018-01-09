package com.dlb.domain;

import java.util.Date;
public class User {
	private static final long serialVersionUID = -4313782718477229465L;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFunctionProfile() {
		return FunctionProfile;
	}
	public void setFunctionProfile(String functionProfile) {
		FunctionProfile = functionProfile;
	}
	public Date getLastLoginDate() {
		return LastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		LastLoginDate = lastLoginDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private String user_id;
	private boolean isActive;
	private String passWord;
	private String FunctionProfile;
	private Date LastLoginDate;
	private String userName;
}
