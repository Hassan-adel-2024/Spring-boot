package com.global.hr.controller;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.global.hr.model.Employee;
import com.global.hr.repository.EmployeeRep;

@RestController
//@RequestMapping()
public class EmployeeController {
	@Autowired
	private EmployeeRep employeeRep;
    
	@GetMapping("/count")
	public int countEmployees() {
		return employeeRep.count();
	}
	
	@GetMapping("/findAll")
	public List<Employee> getAll (){
		
		return employeeRep.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable Long id) {
		return employeeRep.findById(id);
	}
}
