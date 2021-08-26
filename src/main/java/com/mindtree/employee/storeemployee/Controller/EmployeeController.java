package com.mindtree.employee.storeemployee.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mindtree.employee.storeemployee.Service.EmployeeServiceImpl;
import com.mindtree.employee.storeemployee.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl service;
	
	@GetMapping(path = "/employees")
	public List<Employee> retriveAllEmployee(){
		List<Employee> emp = service.findAll();
		return emp;
	}
	
	@PostMapping(path = "/employees")
	public Employee addEmployee(@RequestBody Employee emp){
		Employee empl = service.addEmployee(emp);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(empl.getId()).toUri();
		ResponseEntity.created(location).build();
		return emp;
	}
}
