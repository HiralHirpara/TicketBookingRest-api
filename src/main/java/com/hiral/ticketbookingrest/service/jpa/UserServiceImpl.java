package com.hiral.ticketbookingrest.service.jpa;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.hiral.ticketbookingrest.model.User;
import com.hiral.ticketbookingrest.repository.UserRepository;
import com.hiral.ticketbookingrest.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> fetchUserList(){
		return userRepository.findAll();
	}
	
	@Override
	public User fetchUser(Long id){
		Optional<User> user = userRepository.findById(id);
		
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}
	
	@Override
	public User addUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User updateUser(Long id, User user) {
		if(user.getId() != id) {
			return null;
		}
		Optional<User> oldUser = userRepository.findById(id);
		
		if(oldUser.isPresent()) {
			return userRepository.save(user);
		}
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	
	

}
