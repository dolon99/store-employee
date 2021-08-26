package com.mindtree.employee.storeemployee.Service;

import java.util.List;

import com.mindtree.employee.storeemployee.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee addEmployee(Employee emp); 
}
