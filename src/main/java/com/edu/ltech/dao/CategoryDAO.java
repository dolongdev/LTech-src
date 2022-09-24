package com.edu.ltech.dao;

import com.edu.ltech.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category, String>{

}
