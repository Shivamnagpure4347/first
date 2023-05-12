package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AuthorRepository;
import com.model.Author;
@Service
public class AuthorServiceImplementation implements AuthorService {
	@Autowired
	AuthorRepository authorRepo;
	
	@Override
	public Author addAuthor(Author s) {
		return authorRepo.save(s);
	}

	@Override
	public Author deleteData() {
		authorRepo.deleteAll();
		return null;
	}

	

	
	



}
