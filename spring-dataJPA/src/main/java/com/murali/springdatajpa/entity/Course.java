package com.murali.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    @Id
    @SequenceGenerator(name = "CourseId_seq",
    sequenceName = "CourseId_seq",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "CourseId_seq")
    private int courseId;
    @Column(unique = true,
    nullable = false)
    private String courseName;
    private int courseCredits;
}
