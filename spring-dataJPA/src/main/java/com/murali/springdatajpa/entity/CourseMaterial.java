package com.murali.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterial {
    @Id
    @SequenceGenerator(name = "CourseMetId_seq",
            sequenceName = "CourseMetId_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "CourseMetId_seq")
    private int courseMaterialId;
    private String url;
    @OneToOne
    @JoinColumn(name = "course_id",
                referencedColumnName = "courseId")
    private Course course;

}
