package com.project.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.bean.UserBean;
import com.project.service.IUserService;

@Controller
@RequestMapping("user")
public class Pcontroller {
	@Autowired
	private IUserService service1;
	/**
	 * 注册
	 * @param userName
	 * @param passWord
	 * @return
	 */
	@RequestMapping("register.lovo")
	public ModelAndView register(String userName,String passWord,String address,String age,String sex) {
		ModelAndView mv = new ModelAndView();
		UserBean bean = new UserBean();
		bean.setUserName(userName);
		bean.setPassWord(passWord);
		bean.setAddress(address);
		bean.setAge(age);
		bean.setSex(sex);
		service1.add(bean);
		mv.setViewName("login");
		return mv;	
	}
	/**
	 * 登录
	 * @param userName
	 * @param passWord
	 * @return
	 */
	@RequestMapping("login.lovo")
	public ModelAndView login(String userName,String passWord) {
		ModelAndView mv = new ModelAndView();
		Boolean a = service1.login(userName, passWord);
		if(a==false)
		{
			mv.setViewName("fail");
			return mv;
		}
		else
		{
		mv.setViewName("main");
		return mv;
		}
	}
	@RequestMapping("findByType1.lovo")
	@ResponseBody//只展示数据
	public List<UserBean> findByType() {
		List<UserBean> list1 = service1.getListUser();
		return list1;	
	}
	@RequestMapping("tiaozhuan.lovo")
	@ResponseBody//只展示数据
	public ModelAndView findByType1(String userName) {
		service1.delById(userName);
			
	}

}
