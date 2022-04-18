package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccessController {
	
	@GetMapping("/access_list")
	String getAccessList() {
		
		return "admin/access_list";
	}
	
}
