package com.freshers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service
public class EmailService {
 
	private JavaMailSender javaMailSender;
	
	//Constructor
	@Autowired
	public EmailService(JavaMailSender javaMailSender) {

		this.javaMailSender = javaMailSender;
	}
	
	public void email(SimpleMailMessage simpleMailMessage) {
		
//		SimpleMailMessage simpleMailMessage1 = new SimpleMailMessage();
		simpleMailMessage.setTo("gnanasaikalupudi@gmail.com");
		simpleMailMessage.setSubject("Freshers database updated...............");
		javaMailSender.send(simpleMailMessage);
	}
	

}