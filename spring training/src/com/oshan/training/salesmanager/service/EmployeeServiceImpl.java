package com.oshan.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oshan.training.salesmanager.model.Employee;
import com.oshan.training.salesmanager.repository.EmployeeRepository;
import com.oshan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
		
		System.out.println("Default constructor executed");
	}
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("overloaded constructor executed");
		this.employeeRepository = employeeRepository;
	}
	



	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}



	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter injection fired");
		this.employeeRepository = employeeRepository;
	}




	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}

}
