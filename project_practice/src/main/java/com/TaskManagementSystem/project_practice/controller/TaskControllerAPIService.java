package com.TaskManagementSystem.project_practice.controller;

import org.springframework.format.annotation.DateTimeFormat;
import com.TaskManagementSystem.project_practice.model.Task;
import com.TaskManagementSystem.project_practice.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController

@RequestMapping("/task")

public class TaskControllerAPIService {

    TaskService taskService;

    public TaskControllerAPIService(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("{taskID}")
    public Task getTaskDetails(@PathVariable("taskID") String taskID) {
        return taskService.getTaskById(taskID);
    }

    @GetMapping()
    public List<Task> getAllTasksDetails(){
        return taskService.getAllTasks();
    }
    // GET - http://localhost:8080/task/date?taskDate=2023-12-30  ("date you want to search for")
    @GetMapping("/date")
    public List<Task> getAllTasksByDate(@RequestParam("taskDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate taskDate) {
        return taskService.getTasksByDate(taskDate);
    }


    @PostMapping
    public String createTaskForUser(@RequestBody Task task){
        this.taskService.createTask(task);
        return "Task created successfully";
    }

    @PutMapping
    public String updateTaskForUser(@RequestBody Task task){
        this.taskService.updateTask(task);
        return "Task updated successfully";
    }

    @DeleteMapping("{taskID}")
    public String deleteTaskByID(@PathVariable("taskID") String taskID){
        this.taskService.deleteTask(taskID);
        return "Task deleted successfully";
    }
}
