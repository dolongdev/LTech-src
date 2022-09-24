package com.edu.ltech.controller.rest;

import com.edu.ltech.entity.Role;
import com.edu.ltech.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/rest/roles")
public class RoleRestController {
	@Autowired
	RoleService roleSv;
	
	@GetMapping
	public List<Role> getAll(){
		return roleSv.findAll();
	}
}
