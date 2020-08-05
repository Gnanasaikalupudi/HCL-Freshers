package com.freshers.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.freshers.model.Data;
import com.freshers.repository.DataRepo;



@Service
public class DataService {
	 @Autowired
	    DataRepo dataRepository;
	    @Autowired
	    EmailService emailService;
	    Logger log = LoggerFactory.getLogger(DataService.class);

	 

	    
	    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

	 

	    
	    public Data addData(@RequestBody Data data) {
	        //Optional<Data> data1=dataRepository.findBySBU(data.getSBU());
	        //if(data1.isPresent()) {
	            //throw new DataNotFoundException("the sbu is alreay exist");
	        //}
	        // dataRepository.save(new Data(data.getSBU(),data.getCount()));
	        
	        dataRepository.save(data);
	        
	        simpleMailMessage.setText(data.toString());
	        emailService.email(simpleMailMessage);
	        log.info("<-----Email sent sucessfullyyyyy-------->");
	        
	        return data;
	        
	    }
	    
	    public List<Data> findAll()
	    {
	        List<Data> employeeList = dataRepository.findAll();
	         
	        if(employeeList.size() > 0) {
	            return employeeList;
	        } else {
	            return new ArrayList<Data>();
	        }
	    }

		

	        
	    }
	 