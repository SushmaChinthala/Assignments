package com.springboot.using.mongodb.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController 
{
CustomerService service;

public CustomerController(CustomerService service) {
	super();
	this.service = service;
}
@GetMapping("/customer")
public List<Customer> retrieveAllCustomers()
{
	return service.reteieveAll();
}
@PostMapping("/customer")
public Customer addCustomer(@RequestBody Customer customer)
{
	return service.save(customer);
}
@GetMapping("/customer/{id}")
public Customer findOneCustomer(@PathVariable int id)
{
	return service.findOne(id);
}
@DeleteMapping("/customer/{id}")
public void deleteCustomer(@PathVariable int id)
{
	service.deleteOne(id);
}
}
