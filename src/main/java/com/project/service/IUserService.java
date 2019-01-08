package com.project.service;

import java.util.List;

import com.project.bean.UserBean;


public interface IUserService {
	/**
	 * 登录
	 * @param userName
	 * @param passWord
	 */
	public Boolean login(String userName,String passWord);
	/**
	 * 注册添加
	 * @param userBean
	 */
	public void add(UserBean userBean);
	 /**
     * 获取所用用户
     * @return
     */
	public List<UserBean> getListUser();
	/**
     * 根据用户id删除用户
     * @return
     */
	public void delById(int id);
	/**
	 * 根据id修改用户
	 * @param id
	 * @param userBean
	 */
	public void updateById(String userName,String passWord,String sex,String age,String address);
}
