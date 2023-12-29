package com.TaskManagementSystem.project_practice.service.impl;

import com.TaskManagementSystem.project_practice.model.Task;
import com.TaskManagementSystem.project_practice.repository.TaskRepository;
import com.TaskManagementSystem.project_practice.service.TaskService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @Override
    public String createTask(Task task){
        taskRepository.save(task);
        return "success";
    }
    @Override
    public String updateTask(Task task){
        taskRepository.save(task);
        return "success";
    }
    @Override
    public String deleteTask(String taskID) {
        taskRepository.deleteById(taskID);
        return "deleted";
    }

    @Override
    public Task getTaskById(String taskID){
        return taskRepository.findById(taskID).get();
    }
    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    public List<Task> getTasksByDate(LocalDate taskDate) {
        // Implement the logic to retrieve tasks based on the provided date
        // For example, you can use the taskRepository.findByTaskDueDate(taskDate) or any other appropriate method.
        return taskRepository.findByTaskDueDate(taskDate);
    }


}

