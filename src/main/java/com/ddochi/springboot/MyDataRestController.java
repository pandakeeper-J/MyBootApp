package com.ddochi.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddochi.springboot.repositories.MyDataRepository;

@RestController
public class MyDataRestController {

	@Autowired
	MyDataRepository repository;
	
	@Autowired
	private MyDataService service;

	@RequestMapping("/rest")
	public List<MyData> restAll() {
		return repository.findAll();
	}

	@RequestMapping("/rest/{num}")
	public MyData restBy(@PathVariable int num) {
		return repository.findById((long)num);
	}
}