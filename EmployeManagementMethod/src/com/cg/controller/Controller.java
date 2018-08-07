package com.cg.controller;

import java.util.List;

import com.cg.employee.Employee;
import com.cg.employeeservice.EmployeeService;

public class Controller {
	EmployeeService employeeService;
	Employee employee;

	public void setEmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void addEmployee(Employee employee) {
		employeeService.addEmployee(employee);
	}

	public List<Employee> viewAllEmployee() {
		return employeeService.viewAllEmployee();
	}

	public Employee viewEmployeeById(int id) {
		return employeeService.viewEmployeeById(id);
	}

	public List<Employee> deleteEmployeeById(int id) {
		return employeeService.deleteEmployeeById(id);
	}
}
