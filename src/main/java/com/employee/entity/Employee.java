package com.employee.entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long empId;

    @Column(name = "emp_name", nullable = false)
    private String empName;

    @Column(name = "emp_salary", nullable = false)
    private int empSalary;

    @Column(name = "emp_dept", nullable = false)
    private String empDept;

    @Column(name = "emp_email", nullable = false)
    private String empEmail;

    @Column(name = "emp_phone", nullable = false)
    private String empPhone;


}