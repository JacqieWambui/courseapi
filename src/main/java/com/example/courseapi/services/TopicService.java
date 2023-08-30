package com.example.courseapi.services;

import com.example.courseapi.controller.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private  List<Topic> topics = new ArrayList<>( Arrays.asList(
                new Topic("Spring", "Spring Framework", "SpringFramework Description"),
                new Topic("Java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        ));

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

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    /*
    Loop through every topic depending on the size of the topic
    for each topic in the list compare with the id, if its matches
    update it
     */
    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if(t.getId().equals(id)) {
                topics.set(i,topic);
                return;
            }
        }
    }
}
