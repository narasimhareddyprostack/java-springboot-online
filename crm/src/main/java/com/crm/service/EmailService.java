package com.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	JavaMailSender mailSender;
	
	public void sendEmailToUser(String mailid, String name) {
		System.out.println("Email Starting");
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(mailid);
		mailMessage.setSubject("Mail from CRM Application");
		mailMessage.setText("Hello"+name+ ", Thanks Register");
		mailSender.send(mailMessage);
		System.out.println("Email Ending");
		
	}
}
