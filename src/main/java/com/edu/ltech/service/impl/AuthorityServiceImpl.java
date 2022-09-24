package com.edu.ltech.service.impl;

import com.edu.ltech.dao.AccountDAO;
import com.edu.ltech.dao.AuthorityDAO;
import com.edu.ltech.entity.Account;
import com.edu.ltech.entity.Authority;
import com.edu.ltech.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {
	@Autowired
	AuthorityDAO dao;
	@Autowired
	AccountDAO acdao;
	
	@Override
	public List<Authority> findAllAuthorOfAdmin() {
		List<Account> accounts = acdao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}
	@Override
	public List<Authority> findAll() {
		return dao.findAll();
	}
	@Override
	public Authority create(Authority au) {
		return dao.save(au);
	}
	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}
	


}
