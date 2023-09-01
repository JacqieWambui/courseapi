package com.example.courseapi.controller;

import com.example.courseapi.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired  //declares this as a dependency
    private TopicService topicService;
    @RequestMapping("/topics")
//    getAllTopics to retun list of topics objects done
    public List<Course> getAllTopics() {
        return topicService.getAllCourse();
    }

    //returns one topic
    @RequestMapping("/topics/{id}")
    public Course getTopic(@PathVariable  String id){
        return  topicService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public  void addTopic( @RequestBody Course course) {
        topicService.addCourse(course);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Course course, @PathVariable String id){
        topicService.updateCourse(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable Course id) {
        topicService.deleteCourse(id);
    }


}

