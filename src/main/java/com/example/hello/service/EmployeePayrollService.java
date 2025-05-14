package com.example.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.dto.EmployeePayrollDTO;
import com.example.hello.model.EmployeePayrollData;
import com.example.hello.repository.EmployeePayrollRepository;

import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository employeeRepo;

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeeRepo.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeeRepo.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + empId));
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = new EmployeePayrollData(empPayrollDTO.getName(), empPayrollDTO.getSalary());
        return employeeRepo.save(empData);
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData existing = this.getEmployeePayrollDataById(empId);
        existing.setName(empPayrollDTO.getName());
        existing.setSalary(empPayrollDTO.getSalary());
        return employeeRepo.save(existing);
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        EmployeePayrollData data = this.getEmployeePayrollDataById(empId);
        employeeRepo.delete(data);
        
    }
    
    
}
