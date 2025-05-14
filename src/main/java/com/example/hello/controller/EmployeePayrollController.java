package com.example.hello.controller;

import com.example.hello.dto.EmployeePayrollDTO;
import com.example.hello.model.EmployeePayrollData;
import com.example.hello.service.IEmployeePayrollService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @GetMapping("/")
    public List<EmployeePayrollData> getAllEmployees() {
        return employeePayrollService.getEmployeePayrollData();
    }

    @GetMapping("/get/{empId}")
    public EmployeePayrollData getEmployeeById(@PathVariable int empId) {
        return employeePayrollService.getEmployeePayrollDataById(empId);
    }

    @PostMapping("/create")
    public EmployeePayrollData createEmployee(@Valid @RequestBody EmployeePayrollDTO empPayrollDTO) {
        return employeePayrollService.createEmployeePayrollData(empPayrollDTO);
    }

    @PutMapping("/update/{empId}")
    public EmployeePayrollData updateEmployee(@PathVariable int empId, @Valid @RequestBody EmployeePayrollDTO empPayrollDTO) {
        return employeePayrollService.updateEmployeePayrollData(empId, empPayrollDTO);
    }

    @DeleteMapping("/delete/{empId}")
    public String deleteEmployee(@PathVariable int empId) {
        employeePayrollService.deleteEmployeePayrollData(empId);
        return "Employee with ID " + empId + " deleted successfully.";
    }
    
}
