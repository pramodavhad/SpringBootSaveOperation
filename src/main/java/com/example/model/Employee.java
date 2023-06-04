package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="employee")
public class Employee {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	
	public Employee(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	
	
}
