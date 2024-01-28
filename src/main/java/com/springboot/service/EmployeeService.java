package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.Employee;

@Service
public interface EmployeeService {

	Employee addEmployee(Employee employee);

	Employee findById(int id);

	Employee updateEmployee(Employee employee);

	String deleteByid(int id);

	List<Employee> addEmployees(List<Employee> employees);

	List<Employee> getAllEmployees();

}
