package com.user.service;

import org.springframework.transaction.annotation.Transactional;

import com.user.dao.UserDao;

@Transactional
public class UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add(){
		userDao.add();
	}
		
}
