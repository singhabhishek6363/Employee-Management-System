package com.employee.controller;


import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeService.saveEmployee(employee);
        return employee1;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return employees;
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
    }


    @PutMapping
    public Employee updateEmployee(@RequestParam Long id , @RequestBody Employee employee) {
        Employee employee1 = employeeService.updateEmployee(id ,employee);
        return employee1;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        Employee employee1 = employeeService.getEmployeeById(id);
        return employee1;
    }


}
