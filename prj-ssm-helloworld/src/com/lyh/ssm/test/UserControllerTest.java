package com.lyh.ssm.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lyh.ssm.controller.UserController;

public class UserControllerTest {

	private ConfigurableApplicationContext wac;
	private ConfigurableApplicationContext mvc;
	@Before
	public void init() {
		//此处的applicationContext.xml配置文件中将controller注解排除掉了的，所以此处不能用它获取controller对象
		//wac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		mvc = new ClassPathXmlApplicationContext("spring/applicationContext-mvc.xml");
	}
	@Test
	public void test1() {
		System.out.println(mvc == null);
		UserController u1 = mvc.getBean(UserController.class);
		UserController u2 = mvc.getBean(UserController.class);
		u2.index(2, null);
		System.out.println("IOC容器获取的两个对象："+u1.equals(u2));
	}
}
