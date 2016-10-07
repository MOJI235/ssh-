package com.user.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.user.entity.User;

public class UserDao {
			private HibernateTemplate hibernateTemplate;
			public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
				this.hibernateTemplate = hibernateTemplate;
			}
			
			public void add(){
				User user = new User();
				user.setUsername("张三");
				user.setPassword("111");
				hibernateTemplate.save(user);
			}
}
