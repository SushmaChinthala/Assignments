package com.example.RESTAPI.RESTAPIDEMO.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.example.RESTAPI.RESTAPIDEMO.user.User;



@Component
public class EmployeeService 
{
	private  static int empCount=0;
private static List<Employee1> emp=new ArrayList<>();
static
{

	emp.add(new Employee1(++empCount,"Sushma","D","employe",16000));
	emp.add(new Employee1(++empCount,"Srimanya","De","employe1",19000));
	emp.add(new Employee1(++empCount,"Prathyusha","Def","employee2",18000));
	emp.add(new Employee1(++empCount,"Poojitha","gh","employe3",20000));
}
public Employee1 saves(Employee1 employee)
{
	 employee.setEmployeeId(++empCount);
	emp.add(employee);
	return employee;
}
public List<Employee1> findAll()
{
	return emp;
}
public void deleteByEmployeeId(int id)
{
	Predicate<? super Employee1> predicate= e -> e.getEmployeeId().equals(id);
	emp.removeIf(predicate);
	
	}




public Employee1 findOne(int id)
{
	Predicate<? super Employee1> predicate=u->u.getEmployeeId().equals(id);
	return emp.stream().filter(predicate).findFirst().orElse(null);
	}
}
