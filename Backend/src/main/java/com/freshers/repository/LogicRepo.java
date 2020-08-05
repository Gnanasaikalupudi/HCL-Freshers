package com.freshers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshers.model.Login;

public interface LogicRepo extends 	JpaRepository<Login, String> {
		Login findByUserNameAndPassword(String userName,String password);

		
	}

