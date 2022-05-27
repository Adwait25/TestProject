package com.te.spring_validator.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.spring_validator.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
