package com.oshan.training.salesmanager.repository;

import java.util.List;

import com.oshan.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}