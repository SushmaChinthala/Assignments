package com.example.RESTAPI.RESTAPIDEMO.Employee;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;



@RestController
public class EmployeeController {
	private EmployeeService ser;

	public EmployeeController(EmployeeService ser) {
		this.ser = ser;
	}
    @GetMapping("/employee")
	public List<Employee1> retrieveAllUsers() {
		return ser.findAll();
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Employee1> createUser(@Valid @RequestBody Employee1 employee)
	{
	 Employee1 saved=ser.saves(employee);
	URI location=ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{employeeId}")
				.buildAndExpand(saved.getEmployeeId())
				.toUri();
		return ResponseEntity.created(location).build();
		
	}
	@DeleteMapping("/employee/{id}")
	public void deleteEmploee(@PathVariable int id)
	{
		
		ser.deleteByEmployeeId(id);
			
	}
	@GetMapping("/employee/{id}")
	public Employee1 getdeatils(@PathVariable int id)
	{
		
		return ser.findOne(id);
			
	}

	
		
		
	

}

