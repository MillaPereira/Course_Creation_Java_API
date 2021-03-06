package com.example.demo.course;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table

public class Course {
    @Id
    @SequenceGenerator(
        name = "course_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "course_sequence"
    )
    private String course_name;
    private Integer course_id;
    private String course_code;
    private LocalDate course_creation_date;
    private String course_coordinator;

    public Course () {

    }

    public Course (String course_name, 
                   Integer course_id, 
                   String course_code, 
                   LocalDate course_creation_date, 
                   String course_coordinator){
        this.course_name = course_name;
        this.course_id = course_id;
        this.course_code = course_code;
        this.course_creation_date = course_creation_date;
        this.course_coordinator = course_coordinator;
    }

    public Course (String course_name,
                   String course_code, 
                   LocalDate course_creation_date, 
                   String course_coordinator){
        this.course_name = course_name;
        this.course_code = course_code;
        this.course_creation_date = course_creation_date;
        this.course_coordinator = course_coordinator;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public LocalDate getCourse_creation_date() {
        return course_creation_date;
    }

    public void setCourse_creation_date(LocalDate course_creation_date) {
        this.course_creation_date = course_creation_date;
    }

    public String getCourse_coordinator() {
        return course_coordinator;
    }

    public void setCourse_coordinator(String course_coordinator) {
        this.course_coordinator = course_coordinator;
    }

    @Override
    public String toString(){
        return "Course{" +
                "id = " + course_id +
                ", name = " + course_name +
                ", code = " + course_code +
                ", creation date = " + course_creation_date +
                ", coordinator = " + course_coordinator +
                '}';
    }
}