package com.backend.foodr.controller;

import com.backend.foodr.model.User;
import com.backend.foodr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ={"http://localhost:4200", "http://localhost:3000"}, allowCredentials = "true")
public class UserController {

    /**
     *
     * Member Variables
     *
     */

    UserService userService;



    /**
     *
     * Cosntructor
     *
     */

    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;

    }



    /**
     *
     * Class Methods
     *
     */

    @PostMapping("user/login")
    public User attemptLogin(@RequestBody User user) {

        return this.userService.attemptLogin(user.getEmail(), user.getPassword());

    }

    @PostMapping("user/register")
    public User registerNewUser(@RequestBody User user) {

        return this.userService.registerNewUser(user);

    }

    @GetMapping("user/{id}")
    public User getUserbyId(@PathVariable Long id) {

        return this.userService.getUser(id);

    }

}
