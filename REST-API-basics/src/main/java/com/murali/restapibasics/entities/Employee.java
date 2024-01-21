package com.murali.restapibasics.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Employee {

    @Id
    private int id;
    @NotBlank(message = "Enter a name...")
    private String name;
    private String role;
    private String address;
    @Email(message = "enter a valid email format...")
    private String email;

    public Employee() {
    }
    public Employee(int id, String name, String role, String address, String email) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.address = address;
        this.email= email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
