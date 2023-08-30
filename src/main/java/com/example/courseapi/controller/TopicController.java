package com.example.courseapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
//    getAllTopics to retun list of topics objects done
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Spring", "Spring Framework", "SpringFramework Description"),
                new Topic("Java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")


        );
    }
}

