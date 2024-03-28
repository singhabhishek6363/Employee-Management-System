package com.employee.service;

import com.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Employee updateEmployee( Long id  , Employee employee);

    void deleteEmployeeById(Long id);

    List<Employee> getAllEmployees();
}
