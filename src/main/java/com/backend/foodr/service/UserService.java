package com.backend.foodr.service;

import com.backend.foodr.model.User;
import com.backend.foodr.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    /**
     *
     * Member Variables
     *
     */

    private UserRepository userRepository;



    /**
     *
     * Constructor
     *
     */

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;

    }



    /**
     *
     * Class Methods
     *
     */

    public User attemptLogin(String email, String password) {

        return this.userRepository.findByEmailAndPassword(email, password);

    }

    public User registerNewUser(User user) {

        return this.userRepository.save(user);

    }

    public User getUser(Long id) {

        return this.userRepository.getReferenceById(id);

    }

}
