package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.crm.dao.impl.RegistraionDaoImpl;
import com.crm.model.CustomerBean;
import com.crm.service.EmailService;
@Controller
public class RegistrationController {
	
	@Autowired
	RegistraionDaoImpl registerDao;
	
	@Autowired
	EmailService emailService;
	
	@GetMapping("/index")
	public String getIndexPage() {
		return "index";
	}
	@GetMapping("/register")
	public String getRegistrationPage(Model model) {
		CustomerBean customerBean = new CustomerBean();
		model.addAttribute("custBean", customerBean);
		System.out.println("getReg Method: Test Case ");
		return "register";
	}
	
	@PostMapping("/save")
	public String registerCustomer( @ModelAttribute("custBean") CustomerBean customerBean){
		//store the data into Databasee
		boolean flag = registerDao.saveCustomer(customerBean);
		System.out.print(flag);
		
		if(flag==true) {
			//Send Email
			emailService.sendEmailToUser(customerBean.getEmail(), customerBean.getFirstName());
			return "success";
		}
		else {
			return "register";
		}
		
	}
	@GetMapping("/login")
	public String loginCustomer() {
		return "login";
	}

}
