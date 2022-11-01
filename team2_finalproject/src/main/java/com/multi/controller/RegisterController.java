package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustomerDTO;
import com.multi.service.CustomerService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	CustomerService cust_service;
	
	String dir = "register/";
	
	@RequestMapping("")
	public String register(Model model) {
		model.addAttribute("center", dir+"register");
		System.out.println("practice");
		return "main";
	}


}
