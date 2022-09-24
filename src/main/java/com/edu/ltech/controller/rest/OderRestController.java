package com.edu.ltech.controller.rest;

import com.edu.ltech.entity.Order;
import com.edu.ltech.service.OrderService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("*")
@RestController
@RequestMapping("/rest/orders")
public class OderRestController {
	@Autowired
	OrderService orderService;
	
	@PostMapping()
	public Order create(@RequestBody JsonNode orderData) {
			return orderService.create(orderData);
	}
	
}
