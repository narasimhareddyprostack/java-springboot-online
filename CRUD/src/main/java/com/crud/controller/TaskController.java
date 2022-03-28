package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Task;
import com.crud.service.TaskService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	
	//localhost:6565/todo/task
	@GetMapping("/task")
	public List getAllTask() {
		return	taskService.getAllTask();
	}
	//localhost:6565/todo/task/add/
	@PostMapping(value="/add/", consumes="application/json")
	public void addNewTask(@RequestBody Task task) {
		System.out.println("Test Task"+task);
		taskService.addTask(task);
	}
	
	//localhost:6565/todo/update/102
	@PutMapping(value="/update/{id}/", consumes="application/json")
    public void updateTask(@PathVariable String id, @RequestBody Task task) {
		System.out.println("Reading Path Vairable URL"+id);
		taskService.updateTask(task);
	}
	
	
	//localhost:6565/proj/todo/102
	@DeleteMapping(value="/delete/{id}/")
    public void deleteTask(@PathVariable String id) {
		taskService.deleteTask(id);
	}

}
