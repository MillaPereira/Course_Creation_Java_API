package com.example.demo.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	private final CourseRepository courseRepository;

	@Autowired
	public CourseService(CourseRepository courseRepository){
		this.courseRepository = courseRepository;
	}

    public List<Course> getCourse(){
		return courseRepository.findAll();
	}

	public void addNewCourse(Course course){
		Optional<Course> courseByCode = courseRepository
			.findCourseByCode(course.getCourse_code());
			if(courseByCode.isPresent()){
				throw new IllegalStateException("This course already exist.");
			}
			courseRepository.save(course);
	}
	
}
