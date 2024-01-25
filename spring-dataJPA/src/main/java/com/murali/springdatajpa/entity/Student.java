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
@Table(name = "student_table")
public class Student {
    @Id
    @SequenceGenerator(name = "student_id",
                        sequenceName="student_id",
                        allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "student_id"
    )
    private String studentId;
    private String studentName;
    @Column(
            name = "email_address",
            unique = true,
            nullable = false
    )
    private String EmailId;
    private String mobileNo;

    @Embedded
    private Parent parent;
}
