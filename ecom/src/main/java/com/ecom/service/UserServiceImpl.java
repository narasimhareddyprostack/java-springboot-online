package com.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecom.entity.User;
import com.ecom.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepo;
	
	public User saveUser(User user) {
		//business logic
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
	}
	
	public User updateUser(User user) {
		return userRepo.save(user);
	}
	public void deleteUser(Long userId) {
		userRepo.deleteById(userId);
	}
	
	public List<User> findAllUsers(){
		return userRepo.findAll();
	}
	
	public User findByUsername(String username) {	
		return userRepo.findByUsername(username);
	}

	public Long numberOfUsers() {
		// TODO Auto-generated method stub
		return userRepo.count();
	}
}
