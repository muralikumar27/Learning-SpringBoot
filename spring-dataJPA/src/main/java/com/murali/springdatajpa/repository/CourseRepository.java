package com.murali.springdatajpa.repository;

import com.murali.springdatajpa.entity.Course;
import com.murali.springdatajpa.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer>{
}
