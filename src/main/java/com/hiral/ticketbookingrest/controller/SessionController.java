package com.hiral.ticketbookingrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiral.ticketbookingrest.model.Session;
import com.hiral.ticketbookingrest.service.SessionService;

@RestController
@RequestMapping("/session")
public class SessionController {
	
	@Autowired
	private SessionService sessionService;
	
	@PostMapping()
	public Session addSessionn(@RequestBody Session session) {
		return sessionService.addSession(session);
	}
}
