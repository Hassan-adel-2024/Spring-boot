package com.global.hr.repository;

import java.util.List;

import com.global.hr.model.Employee;

public interface EmployeeRep {
    int count();
    Employee findById(Long id);
    List<Employee> findAll();
    int insert(Employee employee);
    int update(Employee employee);
    int delete(Long id);
}
