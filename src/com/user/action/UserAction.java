package com.user.action;

import com.opensymphony.xwork2.ActionSupport;
import com.user.service.UserService;


public class UserAction extends ActionSupport{

	   private UserService UserService;
		public void setUserService(UserService userService) {
		UserService = userService;
	}
		@Override
		public String execute() throws Exception {
			UserService.add();
			return NONE;
		}
}
