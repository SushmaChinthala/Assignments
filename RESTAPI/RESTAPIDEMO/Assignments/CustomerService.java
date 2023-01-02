package com.example.RESTAPI.RESTAPIDEMO.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CustomerService
{

private static List<Customer> customer=new ArrayList<>();
private static int customerCount=0;

	static
	{
		customer.add(new Customer(++customerCount,"Sushma",7864356));
        customer.add(new Customer(++customerCount,"Srimanya",7864356));
        customer.add(new Customer(++customerCount,"Tejaswi",78643467));
				
	}
	public Customer save(Customer newCustomer)
	{
		newCustomer.setId(++customerCount);
		customer.add(newCustomer);
		return newCustomer;
	}
	public List<Customer> reteieveAll()
	{
		return customer;
	}
	public Customer findOne(int id)
	{
		Predicate<? super Customer> predicate = user -> user.getId().equals(id);
	       return customer.stream().filter(predicate).findFirst().orElse(null);
	}
	public void deleteOne(int id)
	{
		 Predicate<? super Customer> predicate = user -> user.getId().equals(id);
	        customer.removeIf(predicate);
		
	}
	
	

}

