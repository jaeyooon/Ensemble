package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {

	String dir = "item/";
	
	@RequestMapping("/medialist")
	public String medialist(Model model) {
		model.addAttribute("center", dir+"medialist");
		return "main";
	}
	
	@RequestMapping("/explist")
	public String explist(Model model) {
		model.addAttribute("center", dir+"explist");
		return "main";
	}
	
	@RequestMapping("/privatelist")
	public String privatelist(Model model) {
		model.addAttribute("center", dir+"privatelist");
		return "main";
	}
	
	@RequestMapping("/speciallist")
	public String speciallist(Model model) {
		model.addAttribute("center", dir+"speciallist");
		return "main";
	}
	
	@RequestMapping("/itemdetail")
	public String itemdetail(Model model) {
		model.addAttribute("center", dir+"itemdetail");
		return "main";
	}
}
