package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entity.User;
import com.ecom.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//url: localhost:6565/api/user/registration
	@PostMapping("/api/user/registration")
	public ResponseEntity<?> registration(@RequestBody User user){
		 System.out.println("registration request - method");
		 if(userService.findByUsername(user.getUsername()) !=null) { 
			 return new ResponseEntity<>(HttpStatus.CONFLICT); 
		 }
		
		return new ResponseEntity<>(userService.saveUser(user),HttpStatus.OK);
	}
	
}
