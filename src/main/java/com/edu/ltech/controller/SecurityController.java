package com.edu.ltech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
		@RequestMapping("/security/login/form")
		public String login(Model model) {
			model.addAttribute("message", "Please login to use!!");
			return "views/security/login";
		}
		
		@RequestMapping("/security/login/success")
		public String loginSuccess(Model model) {
			model.addAttribute("message", "Login Completed!!");
			return "views/security/login";
		}
		
		@RequestMapping("/security/login/error")
		public String loginError(Model model) {
			model.addAttribute("message", "Login Failed!!");
			return "/views/security/login";
		}

		@RequestMapping("/security/register")
		public String register(Model model) {
			model.addAttribute("message", "Register");
			return "/views/security/register";
		}

		@RequestMapping("/security/register/success")
		public String registerSuccess(Model model) {
			model.addAttribute("message", "Registered!!");
			return "views/security/register";
		}

		@RequestMapping("/security/register/error")
		public String registerError(Model model) {
			model.addAttribute("message", "Register Failed!!");
			return "/views/security/register";
		}
		
		
		@RequestMapping("/security/unauthoried")
		public String unauthoried(Model model) {
			model.addAttribute("message", "You can not access permission!!");
			return "/views/security/login";
		}
		
		@RequestMapping("/security/logoff/success")
		public String logOffSuccess(Model model) {
			model.addAttribute("message", "Log off completed!!");
			return "/views/security/login";
		}
}
