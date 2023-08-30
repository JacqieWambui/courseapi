package com.example.courseapi.services;

import com.example.courseapi.controller.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private  List<Topic> topics =  Arrays.asList(
                new Topic("Spring", "Spring Framework", "SpringFramework Description"),
                new Topic("Java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        );

    //create a method that returns a list of topics

    public  List<Topic> getAllTopics() {
        return topics;
    }

    //get a topic
    public  Topic getTopic(String id){
        /*
        get instance of the arrays topics, stream it inorder to filter it,
        get the id of the topics compare it with the id of topic passed, find the first onw then get
         */
        return topics.stream().filter( t-> t.getId().equals(id)).findFirst().get();
    }
}
