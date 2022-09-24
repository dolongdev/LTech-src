package com.edu.ltech.service;



import com.edu.ltech.entity.Account;

import java.util.List;

public interface AccountService {

	Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();

	
}
