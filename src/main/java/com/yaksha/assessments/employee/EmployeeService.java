package com.yaksha.assessments.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import com.yaksha.assessments.employee.exception.EmployeeNotFoundException;

public class EmployeeService {

	List<Employee> employees = new ArrayList<Employee>();

	// Do not change it
	public EmployeeService() {

		addEmployees(employees);

	}

	// Do not update or delete this section
	private void addEmployees(List<Employee> employees) {
		employees.add(new Employee(101, "Shital", 24, "Developer", "IT", 25000));
		employees.add(new Employee(102, "Meena", 26, "Tester", "CO", 57000));
		employees.add(new Employee(103, "Bob", 20, "DevOps Eng", "Admin", 38000));
		employees.add(new Employee(104, "Max", 27, "System Eng", "IT", 70000));
		employees.add(new Employee(105, "Leena", 22, "Developer", "IT", 58000));
		employees.add(new Employee(106, "Mike", 32, "SysOps", "Admin", 35000));
		employees.add(new Employee(107, "Taylor", 19, "Customer Success Manager", "CSM", 56000));
		employees.add(new Employee(108, "Johny", 25, "Account Manager", "Admin", 39000));
		employees.add(new Employee(109, "Irika", 31, "Fullstack Developer", "IT", 89000));
		employees.add(new Employee(110, "Chamble", 29, "Testing Engineer", "IT", 62000));

	}

	// view all employees
	public List<Employee> viewAllEmployees() {
		return null;
	}

	public List<Employee> sortEmployeesByName() {
		return null;
	}

	// view employee based on there id
	public Employee viewEmployeeById(int id) {

		return null;
	}

	// update the employee
	public Employee updateEmployeeById(int id, double salary) {
		return null;

	}
}
