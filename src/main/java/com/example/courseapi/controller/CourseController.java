package com.example.courseapi.controller;

import com.example.courseapi.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired  //declares this as a dependency
    private TopicService courseService;
    @RequestMapping("/topics")
//    getAllCourse to retun list of course objects done
    public List<Course> getAllCourse() {
        return courseService.getAllTopic();
    }

    //returns one course
    @RequestMapping("/topics/{id}")
    public Course getCourse(@PathVariable  String id){
        return  courseService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public  void addCourse(@RequestBody Course course) {
        courseService.addTopic(course);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id){
        courseService.updateTopic(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteCourse(@PathVariable Course id) {
        courseService.deleteTopic(id);
    }


}

