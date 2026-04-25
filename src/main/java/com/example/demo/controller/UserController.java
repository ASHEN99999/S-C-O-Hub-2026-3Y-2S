package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
//test this backend with postman, make sure to run the spring boot application first, then send a GET request to http://localhost:8080/users/getUsers
@RestController
@CrossOrigin
@RequestMapping(value = "/users")


public class UserController {

     @GetMapping("/getUsers")
     public String getUsers() {
          return "List of users";



     }




      @postMapping("/createUsers")
     public String createUsers() {
          return "List of users";



     }
}
