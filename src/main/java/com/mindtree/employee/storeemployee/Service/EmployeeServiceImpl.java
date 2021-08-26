package com.mindtree.employee.storeemployee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.employee.storeemployee.Dao.EmployeeDao;
import com.mindtree.employee.storeemployee.entity.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

//	private static List<Employee> emp = new ArrayList<Employee>();
//	
//	static {
//		emp.add(new Employee(1, "ABC Road"));
//		emp.add(new Employee(2, "EFG Road"));
//	}
	
	public List<Employee> findAll(){
		return employeeDao.findAll();
	}
	
	public Employee addEmployee(Employee empl) {
		return employeeDao.save(empl);
	}

}
