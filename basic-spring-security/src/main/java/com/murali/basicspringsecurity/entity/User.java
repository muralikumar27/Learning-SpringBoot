package com.murali.basicspringsecurity.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String emailId;
    private String role;
    @Column(length = 60)
    private String password;
    private boolean enabled=false;

}
