package com.hiral.ticketbookingrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hiral.ticketbookingrest.model.User;
import com.hiral.ticketbookingrest.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getUsers(){
		List<User> response = userService.fetchUserList();
		return response;
	}
	
	@GetMapping("/{id}")	
	public User getUser(@PathVariable("id") Long id) {
		return userService.fetchUser(id);
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		return userService.updateUser(id,user);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable Long id){
		userService.deleteUser(id);
	}
}
