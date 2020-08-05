package com.freshers.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freshers.model.Data;
import com.freshers.service.DataService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DataController {
	
	@Autowired
	DataService dataService;
	 
	
	@PostMapping("/admin/adddata")
	public Data addData(@RequestBody Data data) {
		return dataService.addData(data);
	}
	
	 @GetMapping("/admin/list")
	    public List<Data> getAllData() {
	        return dataService.findAll();
	    }

}



