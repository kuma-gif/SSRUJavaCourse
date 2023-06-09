package org.adabrain.taskManagement.controllers;

import org.adabrain.taskManagement.Models.Task;
import org.adabrain.taskManagement.interfaces.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/tasks")
@RestController
public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
        this.taskRepository.saveAll(List.of(
                new Task(1, "Complete project", "Finish the project documentation and submit it", "2023-06-30", "pending"),
                new Task(2, "Review proposal", "Review and provide feedback on the client proposal", "2023-06-15", "in progress"),
                new Task(3, "Prepare presentation", "Create slides and rehearse for the upcoming presentation", "2023-07-10", "pending"),
                new Task(4, "Update website content", "Review and update the website content for the new product launch", "2023-07-05", "in progress"),
                new Task(5, "Attend team meeting", "Participate in the weekly team meeting and provide updates", "2023-06-28", "completed")
        ));

    }

    //  Get All Tasks
    //  Retrieves all tasks.
    //  Endpoint: GET /tasks
    @GetMapping
    public Iterable<Task> getAllTasks() {
        return this.taskRepository.findAll();
    }

    //    Get a Task
    //    Retrieves a specific task by ID.
    //    Endpoint: GET /tasks/1
    @GetMapping("/{taskId}")
    public Optional<Task> getTask(@PathVariable int taskId) {
        return this.taskRepository.findById(taskId);
    }

    //    Create a Task
    //    Creates a new task
    //    Endpoint: POST /tasks
    @PostMapping
    public Task createTask(@RequestBody Task newTask) {
        this.taskRepository.save(newTask);
        return newTask;
    }
}
