package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.UserBean;
import com.project.dao.impl.UserDaoImpl;

@Service(value="userService")
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserDaoImpl dao;

	public Boolean login(String userName, String passWord) {
		// TODO Auto-generated method stub
		return dao.login(userName, passWord);
	}


	public List<UserBean> getListUser() {
		// TODO Auto-generated method stub
		return dao.findHQLList();
	}

	public void add(UserBean userBean) {
		dao.savaObject(userBean);
		
	}


	public void delById(int id) {
		// TODO Auto-generated method stub
		dao.delObject(id);
	}


	public void updateById(String userName,String passWord,String sex,String age,String address) {
		String hql="update UserBean u set u.passWord=?,u.sex=?,u.age=?,u.address=?  where u.userName=?";
		dao.updateHQL(hql, new Object[]{userName, passWord,sex,age,address});
	}
	

}
