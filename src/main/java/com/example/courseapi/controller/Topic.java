package com.example.courseapi.controller;

import lombok.Getter;

public class Topic {
    @Getter
    private String id;
    private String  name;
    private String description;

    //This is a no arg constructor
    public Topic() {

    }

    //This is a constructor that initializes the objects
    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
