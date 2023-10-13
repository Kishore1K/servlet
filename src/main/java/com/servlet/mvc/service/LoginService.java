package com.servlet.mvc.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.servlet.mvc.dto.User;


public class LoginService {
	
	HashMap<String, String> users =  new HashMap<>(Map.of("root", "root123", "admin1", "admin1", "root1", "root1"));
	
	public LoginService() {
		users.put("Kishore", "123");
		users.put("kishore1", "test123");
		users.put("admin", "admin");
		users.put("user", "user");
	}
	
	public boolean authenticate(String userName, String password) {
		if(password == null || password.trim() == "") {
			return false;
		}else if (users.get(userName).equals(password)) {
			return true;
		}
		return false;
	}
	
	public User getUserName(String name) {
		User user = new User();
		user.setUserName(name);
		user.setPassword(users.get(name));
		return user;
		
	}

}
