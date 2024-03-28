package com.employee.service.impl;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository  employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);

    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();

    }

    @Override
    public Employee updateEmployee( Long id   , Employee employee) {
        Optional<Employee> byId = employeeRepository.findById(id);

        if(byId.isPresent()) {
            Employee employee1 = byId.get();
            employee1.setEmpId(employee.getEmpId());
            employee1.setEmpEmail(employee.getEmpEmail());
            employee1.setEmpDept(employee.getEmpDept());
            employee1.setEmpSalary(employee.getEmpSalary());
            employee1.setEmpPhone(employee.getEmpPhone());
            return employeeRepository.save(employee1);
        }
       return null;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
