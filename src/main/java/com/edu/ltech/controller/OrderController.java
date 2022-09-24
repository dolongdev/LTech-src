package com.edu.ltech.controller;

import com.edu.ltech.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OrderController {
	
	
	@Autowired
	OrderService orderService;
	
	//Den trang dat hang
	@RequestMapping("/order/checkout")
	public String checkout() {
		return "views/cart/checkout";
	}
	//Liet ke tat ca don hang da dat
	@RequestMapping("/order/list")
	public String orderList(Model model, HttpServletRequest request) {
		String username = request.getRemoteUser();
		model.addAttribute("orders", orderService.findByUsername(username));
		return "views/cart/list";
	}
	//Xem don hang chi tiet
		@RequestMapping("/order/detail/{id}")
		public String detail(@PathVariable("id") Long id,Model model) {
			model.addAttribute("order", orderService.findById(id));
			return "views/cart/checkout";
		}
	
}
