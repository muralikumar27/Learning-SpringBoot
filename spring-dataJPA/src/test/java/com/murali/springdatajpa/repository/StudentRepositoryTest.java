package com.murali.springdatajpa.repository;

import com.murali.springdatajpa.entity.Parent;
import com.murali.springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void saveStudentDetailsTest(){
        Parent parent = Parent.builder()
                .parentEmail("prema@gmail.com")
                .parentName("prema")
                .build();
        Student student = Student.builder()
                .studentName("murali")
                .EmailId("murali@gmail.com")
                .mobileNo(1234512345L)
                .parent(parent)
                .build();

        studentRepository.save(student);

    }
}