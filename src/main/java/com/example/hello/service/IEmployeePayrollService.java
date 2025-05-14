package com.example.hello.service;

import java.util.List;

import com.example.hello.dto.EmployeePayrollDTO;
import com.example.hello.model.EmployeePayrollData;

public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int empId);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);
    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO);
    void deleteEmployeePayrollData(int empId);
    
}
