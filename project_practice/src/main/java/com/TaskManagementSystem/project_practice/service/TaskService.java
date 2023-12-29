package com.TaskManagementSystem.project_practice.service;

import com.TaskManagementSystem.project_practice.model.Task;

import java.time.LocalDate;

import java.util.List;



public interface TaskService {

    public String createTask(Task task);
    public String updateTask(Task task);
    public String deleteTask(String taskID);
    public Task getTaskById(String taskID);
    public List<Task> getAllTasks();

    List<Task> getTasksByDate(LocalDate taskDate);

    List<Task> getSortedTasksByDate(LocalDate taskDate);
}
