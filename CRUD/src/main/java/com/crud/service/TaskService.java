package com.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Task;
import com.crud.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	TaskRepository taskRepo;
	public List getAllTask() {
		List<Task> tasks = new ArrayList();
		taskRepo.findAll().forEach(tasks::add);
		return tasks;
	}

	public void addTask(Task task) {
		System.out.print("Test Case @ AddTask Service" + task);
		taskRepo.save(task);
		
	}

	public void updateTask(Task task) {
		// TODO Auto-generated method stub
		taskRepo.save(task);
		
	}
    
	public void deleteTask(String id) {
		taskRepo.deleteById(id);
		
	}
	

	

}
