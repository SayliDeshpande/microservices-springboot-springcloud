package com.myfirst.rest.services.restfulwebservices.users;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

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
		User user = service.getUser(id);
		if(user == null)
			throw new UserNotFoundException("id : "+ id);
		return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createuser(@Valid @RequestBody User user) {
		User saveduser = service.save(user);
		URI Location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(saveduser.getId())
				.toUri();
		return ResponseEntity.created(Location).build();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		service.removeUser(id);
		
	}

}
