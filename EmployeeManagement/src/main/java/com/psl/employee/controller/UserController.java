package com.psl.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psl.employee.model.User;
import com.psl.employee.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public User newUser(@RequestBody User user)
	{
		return service.addUser(user);
	}
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return service.getall();
	}
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable Long id)
	{
		return service.getbyid(id);
	}
	@PutMapping("/user/{id}")
	public User updateUser(@RequestBody User user,@PathVariable Long id)
	{
		return service.update(user, id);
	}
	@DeleteMapping("user/{id}")
	public String deleteUser(@PathVariable Long id)
	{
		return service.delete(id);
	}
	
	
}
