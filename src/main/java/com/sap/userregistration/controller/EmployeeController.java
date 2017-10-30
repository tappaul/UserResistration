package com.sap.userregistration.controller;

import java.util.List;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sap.userregistration.Model.Employee;
import com.sap.userregistration.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces = "application/json")
	@GET
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, produces = "application/json")
	public Employee getEmployee(@PathVariable("id") long id) {
		return employeeService.getEmployeeById(id);
	}
}
