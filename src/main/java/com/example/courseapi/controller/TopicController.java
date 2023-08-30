package com.example.courseapi.controller;

import com.example.courseapi.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired  //declares this as a dependency
    private TopicService topicService;
    @RequestMapping("/topics")
//    getAllTopics to retun list of topics objects done
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    //returns one topic
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable  String id){
        return  topicService.getTopic(id);
    }
}

