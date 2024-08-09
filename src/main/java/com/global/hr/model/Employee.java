package com.global.hr.model;

public class Employee {
   private long id;
   private String name;
   private double salary;
   

   public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(long id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

// Getter and Setter for id
   public long getId() {
       return id;
   }

   public void setId(long id) {
       this.id = id;
   }

   // Getter and Setter for name
   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   // Getter and Setter for salary
   public double getSalary() {
       return salary;
   }

   public void setSalary(double salary) {
       this.salary = salary;
   }
}
