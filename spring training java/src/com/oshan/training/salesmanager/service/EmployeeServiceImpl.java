package com.oshan.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oshan.training.salesmanager.model.Employee;
import com.oshan.training.salesmanager.repository.EmployeeRepository;
import com.oshan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("overloaded contructor executed");
		this.employeeRepository = employeeRepository;
	}
	
	
	public EmployeeServiceImpl() {
		System.out.println("default constructor");
	}




	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter executed");
		this.employeeRepository = employeeRepository;
	}




	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}

}
