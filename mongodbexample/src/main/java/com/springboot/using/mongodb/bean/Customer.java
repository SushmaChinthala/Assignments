package com.springboot.using.mongodb.bean;

public class Customer
{
private Integer id;
private String Name;
private long phno;
public Customer(Integer id, String name, long phno) {
	super();
	this.id = id;
	Name = name;
	this.phno = phno;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", Name=" + Name + ", phno=" + phno + "]";
}


}
