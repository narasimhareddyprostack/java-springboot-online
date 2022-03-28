package com.jdbc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jdbc.dao.ITestDao;

@Component
public class MyRunner implements CommandLineRunner {

@Autowired
ITestDao dao;

	@Override
	public void run(String... args) throws Exception {
	 dao.insertRecords();
	 List list = dao.selectRecords();
	 list.forEach(map->System.out.println(map));
	 
	 int count = dao.numberRecords();
	 System.out.println(count);
	}

}
