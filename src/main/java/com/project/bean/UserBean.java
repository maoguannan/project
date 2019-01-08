package com.project.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="test_user")
public class UserBean {
		//配置文件路径可能有问题
		//实体必须要一个id
		@Id
		@Column(name="pid",columnDefinition="INT")  //映射表的列
		@GeneratedValue(strategy=GenerationType.IDENTITY) //自动增长
		private Integer userId;
		@Column(length=32)
		private String userName;
		@Column(length=32)
		private String passWord;
		@Column(length=32)
		private String sex;
		@Column(length=32)
		private String age;
		@Column(length=32)
		private String address;
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassWord() {
			return passWord;
		}
		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	
}
