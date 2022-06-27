package com.yaksha.assessments.exception;

import static com.yaksha.assessments.testutils.TestUtils.currentTest;
import static com.yaksha.assessments.testutils.TestUtils.exceptionTestFile;
import static com.yaksha.assessments.testutils.TestUtils.testReport;
import static com.yaksha.assessments.testutils.TestUtils.yakshaAssert;

import java.io.IOException;
import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.yaksha.assessments.employee.Employee;
import com.yaksha.assessments.employee.EmployeeService;
import com.yaksha.assessments.employee.exception.EmployeeNotFoundException;

class ExceptionTest {

	static EmployeeService employeeService = null;
	static List<Employee> list = null;

	@BeforeAll
	public static void setUp() {
		employeeService = new EmployeeService();
		list = employeeService.viewAllEmployees();
	}

	@AfterAll
	public static void afterAll() {
		testReport();
	}


//	@Test
//	public void testEmployeeDoesNotExistsException() throws IOException {
//		Employee employee = list.get(0);
//		employee.setId(101);
//		EmployeeNotFoundException thrown = Assertions.assertThrows(EmployeeNotFoundException.class, () -> {
//			employee.getName();
//		});
//
//		String message = "Employee with id " + employee.getId() + " does not exists";
//		yakshaAssert(currentTest(), message.contentEquals(thrown.getMessage()) ? true : false, exceptionTestFile);
//
//	}

}
