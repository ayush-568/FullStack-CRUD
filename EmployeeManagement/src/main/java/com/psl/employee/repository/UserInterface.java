package com.psl.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.employee.model.User;

public interface UserInterface extends JpaRepository<User, Long>{
	

}
