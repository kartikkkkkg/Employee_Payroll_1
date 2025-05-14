package com.example.hello.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_payroll")
public class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String salary;

    public EmployeePayrollData() {}

    public EmployeePayrollData(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSalary() { return salary; }
    public void setSalary(String salary) { this.salary = salary; }
}
