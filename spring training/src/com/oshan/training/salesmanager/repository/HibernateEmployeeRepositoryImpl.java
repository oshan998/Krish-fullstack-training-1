package com.oshan.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.oshan.training.salesmanager.model.*;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public List<Employee> getAllEmployees(){
	List<Employee> employees = new ArrayList<>();
	
	Employee employee = new Employee();
	
	employee.setEmployeeName("Oshan");
	employee.setEmployeeLocation("Galle");
	employees.add(employee);
	return employees;
	}
	
	
	
	
	
}
