package com.example.demo.course;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class CourseService {
    public List<Course> getCourse(){
		return List.of(
			new Course(
				"Engenharia da Computação",
				12345,
				"123456",
				LocalDate.of(2022, Month.JUNE,22),
				"Roberta"
			)
		);
	}
	
}
