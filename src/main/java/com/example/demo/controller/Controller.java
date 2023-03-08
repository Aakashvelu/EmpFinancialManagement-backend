package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ToDo;
import com.example.demo.repository;
import com.example.demo.service;


@RestController
@CrossOrigin
public class Controller {
	@Autowired
	repository repo;
	
	@Autowired
	service ser;
	
	@GetMapping("/get")
	List<ToDo> getList(){
		return repo.findAll();
	}
	
	@PostMapping("/post")
	public ToDo create (@RequestBody ToDo a) {
		return repo.save(a);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id) {
		return ser.delStudent(id);
	}
	@PutMapping("/put")
	public String update(@RequestBody ToDo up) {
		return ser.updatet(up);
	}
	
	
}