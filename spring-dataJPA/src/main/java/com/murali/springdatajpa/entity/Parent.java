package com.murali.springdatajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Parent {
    private String parentName;
    @Column(name = "p_email_address",
            unique = true,
            nullable = false
    )
    private String parentEmail;

}
