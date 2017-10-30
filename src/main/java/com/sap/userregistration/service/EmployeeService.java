package com.sap.userregistration.service;

import java.util.List;

import com.sap.userregistration.Model.Employee;

public interface EmployeeService {

	Employee getEmployeeById(long id);

	List<Employee> getAllEmployees();

}
