package com.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.entity.Passenger;
import com.jpa.repository.PassengerRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	PassengerRepository passengerRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Passenger p = new Passenger();
		p.setPassengerId(104);
		p.setFirstName("Sonia ");
		p.setLastName("Gandhi");
		p.setEmailId("sonia@gmail.com");
		passengerRepo.save(p);
		//passengerRepo.
		
		
		
	}

}
