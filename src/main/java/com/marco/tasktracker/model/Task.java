package com.marco.tasktracker.model;

public class Task {
    
    private int id;
    private String title;
    private String description;
    private boolean iscompleted;
    private String category;


    public Task() {

    }

    public Task(int id, String title, String description, boolean iscompleted, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.iscompleted = iscompleted;
        this.category = category;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return iscompleted;
    }

    public void setCompleted(boolean iscompleted) {
        this.iscompleted = iscompleted;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
