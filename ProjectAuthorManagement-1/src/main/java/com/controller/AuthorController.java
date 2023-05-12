package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Author;
import com.service.AuthorServiceImplementation;

@RestController
public class AuthorController {
	@Autowired
	AuthorServiceImplementation authService;
	
	@PostMapping("/add")
	public Author addAuthor(Author s) {
		return authService.addAuthor(s);
	}
	
	@DeleteMapping("/DeleteAll")
	public Author deleteData() {
		return authService.deleteData();
	}
	
}
