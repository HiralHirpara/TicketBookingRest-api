package com.hiral.ticketbookingrest.service;

import java.util.List;

import com.hiral.ticketbookingrest.model.User;

public interface UserService {
	
	// Get all User list
	List<User> fetchUserList();
	
	// Get specific User
	User fetchUser(Long id);
	
	// Save User
	User addUser(User user);
	
	// Update User
	User updateUser(Long id, User user);
	
	// Delete User
	void deleteUser(Long id);
}
