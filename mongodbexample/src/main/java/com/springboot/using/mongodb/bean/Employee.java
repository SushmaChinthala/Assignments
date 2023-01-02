package com.springboot.using.mongodb.bean;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="employees")

public class Employee 
{
	
	 @Id
	    private Integer id;
	    private String name;
	    private String depart;
	    private String disgn;
	    private Integer salary;
	    
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Employee(Integer id, String name, String depart, String disgn, Integer salary) {
			super();
			this.id = id;
			this.name = name;
			this.depart = depart;
			this.disgn = disgn;
			this.salary = salary;
		}

		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepart() {
			return depart;
		}
		public void setDepart(String depart) {
			this.depart = depart;
		}
		public String getDisgn() {
			return disgn;
		}
		public void setDisgn(String disgn) {
			this.disgn = disgn;
		}
		public Integer getSalary() {
			return salary;
		}
		public void setSalary(Integer salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", depart=" + depart + ", disgn=" + disgn + ", salary="
					+ salary + "]";
		}
		
	   }
