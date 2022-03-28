package com.prostack.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	public void sayGM() {
		System.out.println("Hello World, Good Morning!");
	}
}
