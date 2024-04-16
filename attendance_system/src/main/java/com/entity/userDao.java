package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;



public class userDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//save student
	@Transactional
	public void saveUser(User user)
	{
		hibernateTemplate.save(user);
	}
	

	
	 
}