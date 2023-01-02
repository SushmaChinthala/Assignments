package com.springboot.using.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.using.mongodb.bean.Employee;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer>
{

}
