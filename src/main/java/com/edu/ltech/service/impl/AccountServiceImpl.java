package com.edu.ltech.service.impl;

import com.edu.ltech.dao.AccountDAO;
import com.edu.ltech.entity.Account;
import com.edu.ltech.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDAO adao;
	
	@Override
	public Account findById(String username) {
		return adao.findById(username).get();
	}

	@Override
	public List<Account> getAdministrators() {
		
		return adao.getAdministrators();
	}

	@Override
	public List<Account> findAll() {
		
		return adao.findAll();
	}

}
