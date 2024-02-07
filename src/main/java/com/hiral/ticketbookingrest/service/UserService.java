package com.hiral.ticketbookingrest.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.hiral.ticketbookingrest.model.User;
import com.hiral.ticketbookingrest.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepositoty;
	
	public List<User> findAll(){
		return userRepositoty.findAll();
	}
	
	public User fetchUser(Long id){
		Optional<User> user = userRepositoty.findById(id);
		
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}

	public User addUser(User user) {
		
		return userRepositoty.save(user);
	}

	public User updateUser(Long id, User user) {
		if(user.getId() != id) {
			return null;
		}
		Optional<User> oldUser =userRepositoty.findById(id);
		
		if(oldUser.isPresent()) {
			return userRepositoty.save(user);
		}
		return null;
	}

	public void deleteUser(Long id) {
		userRepositoty.deleteById(id);
	}
	
	
	

}
