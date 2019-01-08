package com.project.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.bean.UserBean;
import com.project.dao.BasicDao;
import com.project.dao.IUserDao;

@Repository(value="userDao")
public class UserDaoImpl extends BasicDao<UserBean> implements IUserDao{

	public Boolean login(String username, String password) {
		boolean b = false;
		String sql = "Select * from test_user where userName=? and passWord=?";
		List<UserBean> list= this.getCurrentSession().createSQLQuery(sql).setParameter(0, username).setParameter(1, password).list();
		if(list.size()!=0)
		{
			b=true;
		}	
		return b;
	}
}
