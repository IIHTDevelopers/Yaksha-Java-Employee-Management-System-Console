package com.yaksha.assessments.employee;

import java.util.Scanner;

public class EmployeeController {

	EmployeeService service = new EmployeeService();

	public static void menu() {
		System.out.println(
				"\n\n****************Welcome To Employee Managment System *********** \n" + "\n1. View All Employees "
						+ "\n2. View Sorted Employees By Name" + "\n3. Update Employee" + "\n4. Exit\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeService();

	}

}
