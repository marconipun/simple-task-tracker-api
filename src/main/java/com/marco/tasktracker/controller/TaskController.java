package com.marco.tasktracker.controller;


import org.springframework.web.bind.annotation.*;
import com.marco.tasktracker.model.Task;
import com.marco.tasktracker.service.TaskService;  
import java.util.List;;



@RestController
@RequestMapping("/tasks")
public class TaskController {


    //Injecting the dependecy of TskService     
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //calling all tasks
    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    //calling task by id
    @GetMapping("/{id}")
    public Task getTasksById(@PathVariable int id){
        return taskService.getTaskById(id);
    }    

    //creating a new task
    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    //updating a task
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    //deleting a task
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        boolean isdeleted = taskService.deleteTask(id);
        if (isdeleted) {
            return "Task with ID " + id + " deleted successfully.";
        } else {
            return "Task with ID " + id + " not found.";
        }
    }



}
