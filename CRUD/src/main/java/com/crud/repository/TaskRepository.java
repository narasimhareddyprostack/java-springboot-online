package com.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.entity.Task;
import com.sun.xml.bind.v2.model.core.ID;

@Repository
public interface TaskRepository extends CrudRepository<Task, String> {

}
