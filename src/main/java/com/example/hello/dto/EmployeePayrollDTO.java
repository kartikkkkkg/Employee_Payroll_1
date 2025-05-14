package com.example.hello.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class EmployeePayrollDTO {

    @NotBlank(message = "Name is required")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Name should start with capital and have min 3 letters")
    private String name;

    @NotBlank(message = "Salary is required")
    private String salary;

    public EmployeePayrollDTO() {}

    public EmployeePayrollDTO(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSalary() { return salary; }
    public void setSalary(String salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
