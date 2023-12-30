# Task Management System

The Task Management System is a project designed to help users organize and manage their tasks efficiently. It provides a set of APIs for creating, updating, and retrieving tasks, along with features like task prioritization and daily task lists.

## Features

- **Create Task:** Users can create tasks by providing details such as task name, description, due date, priority, start time, and end time.

- **Update Task:** Tasks can be updated to modify details or mark them as completed.

- **Delete Task:** Users can delete tasks by providing the task ID.

- **Get Task Details:** Retrieve detailed information about a specific task using its unique ID.

- **Get All Tasks:** Retrieve a list of all tasks in the system.

- **Get Daily Tasks:** Retrieve a sorted list of tasks for a specific date, sorted by priority.

- **Task Priority:** Tasks are prioritized based on user-defined priority levels.

## Task Entity

The `Task` entity represents the core structure of a task in the system. It includes the following attributes:

- **taskID:** Unique identifier for each task.
- **taskName:** Name or title of the task.
- **taskDescription:** Description of the task.
- **taskDueDate:** Due date for the task.
- **taskPriority:** Priority level assigned to the task.
- **taskStartTime:** Start time for the task.
- **taskEndTime:** End time for the task.

## Technologies Used

- Java
- Spring Boot
- JPA/Hibernate
- Database (Specify your database, e.g., MySQL, PostgreSQL)

## Getting Started

To get started with the Task Management System, follow these steps:

1. Clone the repository.
2. Configure the database settings in the application properties.
3. Build and run the application.

## API Endpoints

- **GET /task/{taskID}:** Retrieve details of a specific task.
- **GET /task:** Retrieve details of all tasks.
- **GET /task/daily/{taskDate}:** Retrieve daily tasks for a specific date.
- **POST /task:** Create a new task.
- **PUT /task:** Update an existing task.
- **DELETE /task/{taskID}:** Delete a task.

## Contributors
Ritwik Shivam

