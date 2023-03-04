package com.myfirst.rest.services.restfulwebservices.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRespources {
	@Autowired
	private UserDaoService service;
	
	@GetMapping("/users")
	public List<User>retrieveAllusers() {
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveuser(@PathVariable int id) {
		return service.getUser(id);
	}
	
	@PostMapping("/users")
	public void createuser(@RequestBody User user) {
		service.save(user);
	}

}
