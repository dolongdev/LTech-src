package com.edu.ltech.service.impl;

import com.edu.ltech.dao.CategoryDAO;
import com.edu.ltech.entity.Category;
import com.edu.ltech.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
		@Autowired
		CategoryDAO dao;

		@Override
		public List<Category> findAll() {
			return dao.findAll();
		}

	

		
}
