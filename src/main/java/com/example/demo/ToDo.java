package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ToDo {
	@Id
	private int id;
	private String name;
//	private String email;
	private int salary;
	private int bonus;
//	private int Total;
	private String isgiven;
	public ToDo() {
		super();
		
	}
	public ToDo(int id,String name,String isgiven,int salary,String email,int bonus) {
		super();
		this.id=id;
		this.name=name;
//		this.isgiven=isgiven;
		this.salary=salary;
//		this.email=email;
		this.bonus=bonus;
//		this.Total=total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
//	public int getTotal() {
//		return Total;
//	}
//	public void setTotal(int total) {
//		Total = total;
//	}
	public String getIsgiven() {
		return isgiven;
	}
	public void setIsgiven(String isgiven) {
		this.isgiven = isgiven;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public int Total() {
//		return bonus+salary;
//	}

}
