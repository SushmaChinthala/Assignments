package com.springboot.using.mongodb.service;
import java.util.List;

import com.springboot.using.mongodb.bean.Employee;

public interface EmployeeServices 
{
	
	public List<Employee>showAllEmployees();
	public Employee showById(int eid);
	public Employee addEmployee(Employee e);
	public Employee updateEmployee(Employee e);
	public void deleteEmployee(int eid);
	}

	



