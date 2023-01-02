package com.springboot.using.mongodb.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.using.mongodb.bean.Employee;
import com.springboot.using.mongodb.repository.EmployeeRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
@Service

public class EmployeeServicesImpl implements EmployeeServices {
	@Autowired
	EmployeeRepository repository;

	@Override
	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Employee showById(int eid) {
		java.util.Optional<Employee> opemp = repository.findById(eid);
		Employee e = null;
		if (opemp.isPresent())
			e = opemp.get();
		return e;
	}

	@Override
	public Employee addEmployee(Employee e) {

		return repository.save(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {

		return repository.save(e);
	}

	@Override
	    public void deleteEmployee(int eid)
	    {
		repository.deleteById(eid);
	    }
	    
	    
		
	     

}
