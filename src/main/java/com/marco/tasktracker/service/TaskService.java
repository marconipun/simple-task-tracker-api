package com.marco.tasktracker.service;

import org.springframework.stereotype.Service;
import com.marco.tasktracker.model.Task;
import java.util.ArrayList;
import java.util.List;


@Service
public class TaskService {
    
    //Store them in memory
    private List<Task> tasks = new ArrayList<>();

    //Count + 1 for each new task
     private int nextId = 1;


     //Get all tasks
     public List<Task> getAllTasks(){
        return tasks;
     }

     //Get task by ID
     public Task getTaskById(int id){
        
        for(Task task : tasks){
            if(task.getId() == id){
                return task;
            }
        }

        return null;
     }

     //create a new task
     public Task createTask(Task task){
        task.setId(nextId++);
        tasks.add(task);
        return task;
     }

     //update a task
     public Task updateTask(int id, Task updatedTask){
        for(Task task : tasks){
            if(task.getId() == id){
                task.setTitle(updatedTask.getTitle());
                task.setDescription(updatedTask.getDescription());
                task.setCompleted(updatedTask.isCompleted());
                task.setCategory(updatedTask.getCategory());
                return task;
            }
        }
        return null;
     }

     //delete a task
     public boolean deleteTask(int id){
        Task task = getTaskById(id);
        if(task != null){
            tasks.remove(task);
            return true;
        }

        return false;
     }

    public TaskService() {
        tasks.add(new Task(nextId++, "Gym", "Leg day workout", false, "Personal"));
        tasks.add(new Task(nextId++, "Study", "Complete Python intermediate course", false, "Study"));
    }



}
