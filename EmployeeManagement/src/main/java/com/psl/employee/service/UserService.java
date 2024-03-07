package com.psl.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.employee.exception.UserNotFoundException;
import com.psl.employee.model.User;
import com.psl.employee.repository.UserInterface;

@Service
public class UserService {
	@Autowired
	private UserInterface repository;
	
	public User addUser(User user)
	{
		return repository.save(user);
	}
	public List<User> getall()
	{
		return repository.findAll();
	}
	public User getbyid(Long id)
	{
		return repository.findById(id)
				.orElseThrow(()->new UserNotFoundException(id));
	}
    public User update(User newuser, Long id)
    {
    	return repository.findById(id)
    			.map(user->{
    				user.setUsername(newuser.getUsername());
    				user.setName(newuser.getName());
    				user.setEmail(newuser.getEmail());
    				return repository.save(user);
    			}).orElseThrow(()-> new UserNotFoundException(id) );
    		
    	}
    public String delete(Long id)
	{
		repository.deleteById(id);
		return "User deleted";
	}
    }
	

