package com.project.dao;


public interface IUserDao {
	/**
	 * 登录
	 * @param userName
	 * @param passWord
	 */
	public Boolean login(String userName,String passWord);
}
