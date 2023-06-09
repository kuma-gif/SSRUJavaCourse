package org.adabrain.taskManagement.interfaces;

import org.adabrain.taskManagement.Models.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> { }
