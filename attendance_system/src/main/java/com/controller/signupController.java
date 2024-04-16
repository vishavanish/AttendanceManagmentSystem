package com.controller;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.User;
import com.entity.userDao;
import com.service.*;

@Controller
public class signupController {
	
	@Autowired
	private userService service;
	
//	@RequestMapping(path="/regi", method=RequestMethod.GET)
	
		@PostMapping("/attendance_system/regi")
		public String showSignupForm(){
			return "sign_up"; //assuming your HTML file is named signup.html
	}


	@PostMapping("/signup")
	public String processSignup(User user) {
	
	System.out.println(new User().getFullname());
	System.out.println(" Object mil gya kya check kr le " +user);
    this.service.createUser(user);
	  
	    return "home";
	}

}
