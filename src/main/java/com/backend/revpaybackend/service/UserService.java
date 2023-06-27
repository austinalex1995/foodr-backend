package com.backend.revpaybackend.Service;

import com.backend.revpaybackend.Model.User;
import com.backend.revpaybackend.Repository.UserRepo;

public class UserService {
	
	/**
	 * Member Variables
	 */
	
	private UserRepo userRepo;
	
	
	
	/**
	 * Constructor
	 */
	
	public UserService(UserRepo repo) {
		
		this.userRepo = repo;
		
	}
	
	
	
	/**
	 * Class Methods
	 */
	
	public User attemptLogin(String email, String password) {
		
		return this.userRepo.findByUsernameAndPassword(email, password);
		
	}
	
	public User registerUser(User user) {
		
		return this.userRepo.save(user);
		
	}

}
