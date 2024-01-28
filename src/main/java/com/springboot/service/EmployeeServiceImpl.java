package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.entity.Employee;
import com.springboot.repository.EmployeeRepository;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee findById(int id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee updateEmployee = employeeRepository.findById(employee.getId()).orElse(null);
		updateEmployee.setName(employee.getName());
		updateEmployee.setCompany(employee.getCompany());
		updateEmployee.setContact(employee.getContact());
		updateEmployee.setSalary(employee.getSalary());
		updateEmployee.setPassportNumber(employee.getPassportNumber());
		updateEmployee.setEmail(employee.getEmail());
		updateEmployee.setDesignation(employee.getDesignation());
		updateEmployee.setAddress(employee.getAddress());
		return employeeRepository.save(updateEmployee);
	}

	@Override
	public String deleteByid(int id) {
		employeeRepository.deleteById(id);
		return "Employee Deleted Successfully....!!";
	}

	@Override
	public List<Employee> addEmployees(List<Employee> employees) {
		return employeeRepository.saveAll(employees);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
