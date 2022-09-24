package com.edu.ltech.service.impl;


import com.edu.ltech.dao.RoleDAO;
import com.edu.ltech.entity.Role;
import com.edu.ltech.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleDAO dao;

	@Override
	public List<Role> findAll() {
		return dao.findAll();
	}

}
