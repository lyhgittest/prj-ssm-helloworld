package com.lyh.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyh.ssm.bean.User;
import com.lyh.ssm.service.UserService;

@Controller
@RequestMapping(value="/user")
@Scope(value="prototype")//创建多实例对象
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index/{id}")
	public String index(@PathVariable("id")Integer id,Model model) {
		User user = userService.selectUserById(id);
		model.addAttribute("user", user);
		/*UserController a = new UserController();
		UserController b = new UserController();
		System.out.println("aaa"+a.hashCode());
		System.out.println("bbb"+b.hashCode());
		System.out.println("通过New创建的两个对象："+a.equals(b));*/
		return "user/index";
	}
}
