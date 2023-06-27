package com.backend.revpaybackend.Controller;

import com.backend.revpaybackend.Model.User;
import com.backend.revpaybackend.Service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {
	
	/**
	 * Member Variables
	 */
	
	private UserService userService;
	
	
	
	/**
	 * Constructor
	 */
	
	public UserController(UserService service) {
		
		this.userService = service;
		
	}
	
	
	
	/**
	 * Class Methods
	 */
	
	@PostMapping("user/login")
	public User attemptLogin(@RequestBody User user) {
		
		return this.userService.attemptLogin(user.getUsername(), user.getPassword());
		
	}
	
	@PostMapping("user/register")
	public User registerUser(@RequestBody User user) {
		
		return this.userService.registerUser(user);
		
	}
	

}
