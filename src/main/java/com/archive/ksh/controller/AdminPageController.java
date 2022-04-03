package com.archive.ksh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.archive.ksh.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminPageController {
	
	final String path = "admin/";
	
	@GetMapping("")
	String adminMain() {
		
		return path + "main";
	}
	
	
	
}
