package com.backend.revpaybackend.Repository;

import com.backend.revpaybackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepo extends JpaRepository<User, Integer> {
	
	User findByUsernameAndPassword(String email, String password);

}
