package com.example.courseapi.services;

import com.example.courseapi.controller.Course;
import com.example.courseapi.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    //Get TopicRepository instance into topic service
    @Autowired
    private CourseRepository courseRepository;

    //create a method that returns a list of topics

    public  List<Course> getAllCourse() {
        //creating a list
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    //get a topic
    public Course getCourse(String id){

          Optional<Course> optionalTopic = courseRepository.findById(id);
          //Check if optional topic contains a value, and return it if present
        if (optionalTopic.isPresent()){
            return optionalTopic.get();
        } else {
            //Handle the case where the topic with the given ID was not found
            //here we could throw an exceptional or return null
            return null;
        }

    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    /*
    Loop through every topic depending on the size of the topic
    for each topic in the list compare with the id, if its matches
    update it
     */
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(Course id) {
         courseRepository.delete(id);
    }
}
