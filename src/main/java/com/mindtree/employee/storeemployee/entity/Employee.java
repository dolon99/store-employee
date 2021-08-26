package com.mindtree.employee.storeemployee.entity;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private long Id;
	private String address;
	
	public Employee() {
		
	}
	
	public Employee(long Id, String address) {
		super();
		this.Id = Id;
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	public long getId() {
		return Id;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setId(long Id) {
		this.Id = Id;
	}
	
	@Override
	public String toString() {
		return String.format("Employee [Id=%s, address=%s]", Id, address);
	}
	
}
