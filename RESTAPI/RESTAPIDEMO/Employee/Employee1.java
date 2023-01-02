package com.example.RESTAPI.RESTAPIDEMO.Employee;

public class Employee1 
{
private Integer employeeId;
private String employeeName;
private String employeeDepartment;
private String employeeDesignation;
private Integer employeeSalary;
public Employee1(int employeeId, String employeeName, String employeeDepartment, String employeeDesignation,
		int employeeSalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeDepartment = employeeDepartment;
	this.employeeDesignation = employeeDesignation;
	this.employeeSalary = employeeSalary;
}
public Integer getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(String employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
public String getEmployeeDesignation() {
	return employeeDesignation;
}
public void setEmployeeDesignation(String employeeDesignation) {
	this.employeeDesignation = employeeDesignation;
}
public int getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(int employeeSalary) {
	this.employeeSalary = employeeSalary;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
			+ employeeDepartment + ", employeeDesignation=" + employeeDesignation + ", employeeSalary=" + employeeSalary
			+ "]";
}


}
