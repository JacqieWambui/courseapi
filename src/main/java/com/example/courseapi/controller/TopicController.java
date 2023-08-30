package com.example.courseapi.controller;

import com.example.courseapi.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public  void addTopic( @RequestBody  Topic topic) {
        topicService.addTopic(topic);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id,topic);
    }
}

