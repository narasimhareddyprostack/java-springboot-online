package com.prostack.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.prostack.beans.HelloBean;

@Component
@Order(2)
public class MyRunner implements CommandLineRunner {

@Autowired
HelloBean helloBean;
	@Override
	public void run(String... args) throws Exception {
		helloBean.sayGM();
	}

}
