package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public ModelAndView getMessage() {
			return new ModelAndView("welcome");
	}
	@GetMapping("/date")
	public String getDate() {
		return "home";
	}

}
