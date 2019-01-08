package T;

import java.util.List;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.bean.UserBean;
import com.project.service.IUserService;

public class Test {
	ClassPathXmlApplicationContext app=null;
	@Before
	public void before(){
		app=new ClassPathXmlApplicationContext("application.xml");
	}
	
	@org.junit.Test
	public void login() {
		IUserService service = (IUserService) app.getBean("userService");
//		UserBean u = new UserBean();
//		u.setSex("男");
//		u.setAddress("sdaas");
//		u.setPassWord("2313");
//		u.setUserName("sdfs");
//		u.setAge("12");
//		service.add(u);
//		System.out.println(service.login("sdfs", "2313"));
//		List<UserBean> list = service.getListUser();
//		for (UserBean userBean : list) {
//			System.out.println(userBean.getUserName());
//		}
//		service.delById(1);
		service.updateById( "sdfsd", "女", "34", "123123","sdfs");
	}
	@org.junit.Test
	public void news() {
//		INewsService service = (INewsService) app.getBean("newsService");
//		NewEntity entity = new NewEntity();
//		entity.setContent("打广告");
//		entity.setDate(Date.valueOf("1990-01-01"));
//		entity.setNwesType("1312");
//		entity.setShowTime(Date.valueOf("2018-12-12"));
//		entity.setTipsName("adad");
//		entity.setTitle("栓递给大是大非");
//		service.add(entity);
//		List<NewEntity> list = service.findAll();
//		for (NewEntity newEntity : list) {
//			System.out.println(newEntity.getCompare());
//		}
//		System.out.println(service.findByType("da"));
//		List<NewEntity> list = service.findByType("影视");
//		List<NewEntity> list1 = service.findByType("其他");
//		List<NewEntity> list2 = service.findByType("体育");
//		List<NewEntity> list3 = service.findByType("游戏");
//		System.out.println(list);
//		System.out.println(list1);
//		System.out.println(list2);
//		System.out.println(list3);
//		System.out.println(service.findByItem("游戏1",null,null));
//		service.update(1, "1");

		/*List<NewEntity> list = service.findByContent("阿");
		for (NewEntity newEntity : list) {
			System.out.println(newEntity.getContent());
		}*/
//		System.out.println(service.findByItem("阿", Date.valueOf("1999-01-01"), Date.valueOf("2200-01-01")));
//		List<NewEntity> list5 = service.findByContent("阿");
//		if(list5!=null&&list5.size()!=0)
//		{
//			System.out.println("fasle");
//		}
//		else
//		{
//			System.out.println("true");
//		}
	}
}
