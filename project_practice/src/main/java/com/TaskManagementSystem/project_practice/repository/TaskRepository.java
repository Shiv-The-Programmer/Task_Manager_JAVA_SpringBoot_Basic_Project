package com.TaskManagementSystem.project_practice.repository;

import com.TaskManagementSystem.project_practice.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, String> {

    List<Task> findByTaskDueDate(LocalDate date);

    List<Task> findByTaskDueDateOrderByTaskPriority(LocalDate taskDueDate);
}
