package com.app.maniManitas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.maniManitas.entity.Category;
import com.app.maniManitas.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
	
	@Autowired
	private  CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	

}
