package com.freshers.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freshers.model.Login;
import com.freshers.repository.LogicRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
@Autowired
private LogicRepo repository;

@GetMapping(value = "/users/fetch")
public List<Login> allUsers() {
List<Login> users = new ArrayList<>();
repository.findAll().forEach(users::add);
return users;
}

@GetMapping(value = "/freshers/read/{userName}")
public Login getLoginDetails(@PathVariable String userName) {
Optional<Login> option = repository.findById(userName);
Login login = null;
if (option.isPresent()) {
login = option.get();
}
return login;
}

@PostMapping(value = "/freshers/adduserName")
public Login addLogin(@RequestBody Login login) {
Login login1 = repository.save(new Login(login.getUserName(),
login.getPassword()));
return login1;

}

@PostMapping(value = "/employees/member/login")
public boolean validateLogin(@RequestBody Login login) {

Login login1=repository.findByUserNameAndPassword(login.getUserName(), login.getPassword());
if(login1!=null) {
	return true;
}
return false;

}



}
