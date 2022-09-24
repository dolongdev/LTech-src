package com.edu.ltech.service;



import com.edu.ltech.entity.Product;

import java.util.List;

public interface ProductService {
	List<Product> findAll();
	Product findById(Integer id);
	List<Product> findByCategoryId(String cid);
	Product create(Product product);
	void delete(Integer id);
	Product update(Product product);

}
