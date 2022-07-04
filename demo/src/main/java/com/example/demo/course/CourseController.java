package com.example.demo.course;

import com.example.demo.course.CourseService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@RestController
@RequestMapping(path = "get/course")

public class CourseController {

	private final CourseService courseService;

	@Autowired
	public CourseController(CourseService courseService){
		this.courseService = courseService;
	}

    @GetMapping
	public List<Course> getCourse(){
		return courseService.getCourse();
	}

	@PostMapping
	public void registerNewCourse(@RequestBody Course course){
		courseService.addNewCourse(course);
	}
    
}
