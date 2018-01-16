package com.lyh.ssm.dao;

import java.util.List;

import com.lyh.ssm.bean.User;

public interface UserDao {

	User selectUser(Integer id);
	List<User> selectUsers();
}
