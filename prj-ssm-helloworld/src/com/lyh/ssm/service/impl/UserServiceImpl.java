package com.lyh.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyh.ssm.bean.User;
import com.lyh.ssm.dao.UserDao;
import com.lyh.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User selectUserById(Integer id) {
		return userDao.selectUser(id);
	}
	
}
