package com.edu.ltech.service.impl;

import com.edu.ltech.dao.ProductDAO;
import com.edu.ltech.entity.Product;
import com.edu.ltech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
		@Autowired
		ProductDAO dao;

		@Override
		public List<Product> findAll() {
			return dao.findAll();
		}

		@Override
		public Product findById(Integer id) {
			return dao.findById(id).get();
		}

		@Override
		public List<Product> findByCategoryId(String cid) {
			return dao.findByCategoryId(cid);
		}

		@Override
		public Product create(Product product) {
			// TODO Auto-generated method stub
			return dao.save(product);
		}

		@Override
		public void delete(Integer id) {
			// TODO Auto-generated method stub
			dao.deleteById(id);
		}

		@Override
		public Product update(Product product) {
			// TODO Auto-generated method stub
			return dao.save(product);
		}
		
		
}
