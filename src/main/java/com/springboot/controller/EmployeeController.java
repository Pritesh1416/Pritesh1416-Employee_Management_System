package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Employee;
import com.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	@GetMapping("/get/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.findById(id);
	}
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteByid(id);
	}
	@PostMapping("/createAll")
	public List<Employee> createAll(@RequestBody List<Employee> employees) {
		return employeeService.addEmployees(employees);
	}
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();
	}

}
