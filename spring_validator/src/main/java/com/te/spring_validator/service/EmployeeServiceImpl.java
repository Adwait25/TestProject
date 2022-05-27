package com.te.spring_validator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.spring_validator.dao.EmployeeDao;
import com.te.spring_validator.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	@Override
	public Employee add(Employee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
	}

}
