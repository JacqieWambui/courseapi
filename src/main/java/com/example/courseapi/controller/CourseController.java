package com.example.courseapi.controller;

import com.example.courseapi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired  //declares this as a dependency
    private CourseService courseService;
    @RequestMapping("/topics/{topicId}/courses")
//    getAllCourse to retun list of course objects done
    public List<Course> getAllCourse() {
        return courseService.getAllCourse();
    }

    //returns one course
    @RequestMapping("/topics/{topicId}/courses/{Id}")
    public Course getCourse(@PathVariable  String id){
        return  courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public  void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/course/{topicId}/courses/{Id}")
    public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String id){
        course.setTopic(new Topic(topicId, "",""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/course/{topicId}/courses/{Id}")
    public void deleteCourse(@PathVariable Course id) {
        courseService.deleteCourse(id);
    }


}

