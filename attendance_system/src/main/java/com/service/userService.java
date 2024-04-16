package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.entity.*;

@Component
@Service
public class userService {
	
	@Autowired
	private userDao userDao;
	

	//save student
	public void createUser(User user)
	{
		userDao.saveUser(user);
	}
	

}
