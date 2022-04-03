package com.archive.ksh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.archive.ksh.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	final String path = "admin/";
	
	@GetMapping("")
	String main() {
		
		return path + "main";
	}
	
	
	
}
