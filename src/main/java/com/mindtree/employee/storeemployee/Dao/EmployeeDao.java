package com.mindtree.employee.storeemployee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.mindtree.employee.storeemployee.entity.Employee;

@Component
public interface EmployeeDao extends JpaRepository<Employee, Long>{

}
