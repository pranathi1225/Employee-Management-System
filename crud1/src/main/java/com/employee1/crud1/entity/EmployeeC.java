package com.employee1.crud1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.time.LocalDate;

@Entity
public class EmployeeC {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    private int status;
    
    private float salary;

    @Column(name = "doj") // Mapping the field to the database column "doj"
    private LocalDate doj; // The field to store the Date of Joining

    public EmployeeC() {
    }

    public EmployeeC(Long id, String name, int status, float salary, LocalDate doj) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.salary = salary;
        this.doj = doj;
    }

    public EmployeeC(String name, int status, float salary, LocalDate doj) {
        this.name = name;
        this.status = status;
        this.salary = salary;
        this.doj = doj;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }
}
