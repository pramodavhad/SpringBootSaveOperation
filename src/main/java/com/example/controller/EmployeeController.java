package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController 
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployeeList(@RequestBody Employee employee){
		Employee emp = employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(emp);
	}
}
