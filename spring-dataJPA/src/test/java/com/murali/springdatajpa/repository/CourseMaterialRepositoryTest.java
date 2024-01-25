package com.murali.springdatajpa.repository;

import com.murali.springdatajpa.entity.Course;
import com.murali.springdatajpa.entity.CourseMaterial;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class CourseMaterialRepositoryTest {

    @Autowired
    CourseMaterialRepository courseMaterialRepository;
    @Autowired
    CourseRepository courseRepository;

    private final Course course = Course.builder()
            .courseName("React")
            .courseCredits(4)
            .build();
    private final CourseMaterial courseMaterial = CourseMaterial.builder()
            .url("www.ReactDevelopers.org")
            .course(course)
            .build();
    @Test
    public void saveCourseMaterialRepositoryTest(){
        courseRepository.save(course);
        courseMaterialRepository.save(courseMaterial);
    }
}