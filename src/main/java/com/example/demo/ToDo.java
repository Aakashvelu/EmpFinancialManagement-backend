package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ToDo {
	@Id
	private int id;
	private String name;
	private String isCompleted;
	public ToDo() {
		super();
		
	}
	public ToDo(int id,String name,String isCompleted) {
		super();
		this.id=id;
		this.name=name;
		this.isCompleted=isCompleted;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsCompleted() {
		return isCompleted;
	}
	public void setIsCompleted(String isCompleted) {
		this.isCompleted = isCompleted;
	}

}
