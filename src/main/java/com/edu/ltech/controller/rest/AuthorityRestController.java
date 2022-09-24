package com.edu.ltech.controller.rest;

import com.edu.ltech.entity.Authority;
import com.edu.ltech.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/authorities")
public class AuthorityRestController {
	@Autowired
	AuthorityService svc;
	
	@GetMapping
	public List<Authority> findAll(@RequestParam("admin") Optional<Boolean> admin){
		if(admin.orElse(false)) {
			return svc.findAllAuthorOfAdmin();
		}
		return svc.findAll();
	}
	@PostMapping
	public Authority post(@RequestBody Authority au) {
		return svc.create(au);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		svc.delete(id);
	}
	
}
