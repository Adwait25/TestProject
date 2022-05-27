package com.te.spring_validator.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.spring_validator.model.Employee;
import com.te.spring_validator.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/addEmployee")
	public ResponseEntity<String> add(@Valid @RequestBody Employee employee) {
		try {
			service.add(employee);
			return new ResponseEntity<>("Data Saved", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>("Data Not Saved", HttpStatus.BAD_REQUEST);
		}
	}
}
