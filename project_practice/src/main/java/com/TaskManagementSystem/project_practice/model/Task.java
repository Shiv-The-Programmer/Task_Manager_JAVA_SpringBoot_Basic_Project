package com.TaskManagementSystem.project_practice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="User_Task_Details")
public class Task {

    @Id
    @Column(name = "taskID")
    private String taskID;

    @Column(name = "taskName")
    private String taskName;

    @Column(name = "taskDescription")
    private String taskDescription;
    @Column(name = "taskDueDate")
    private LocalDate taskDueDate;

    @Column(name = "taskPriority")
    private TaskPriority taskPriority; // enum class in same folder

    @Column(name = "taskStartTime")
    private LocalTime taskStartTime;


    @Column(name = "taskEndTime")
    private LocalTime taskEndTime;

    public Task() {
        // default constructor
    }

    public Task(String taskID, String taskName, String taskDescription, LocalDate taskDueDate, TaskPriority taskPriority) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDueDate = taskDueDate;
        this.taskPriority = taskPriority;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(LocalDate taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public LocalTime getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(LocalTime taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public LocalTime getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(LocalTime taskEndTime) {
        this.taskEndTime = taskEndTime;
    }
}
