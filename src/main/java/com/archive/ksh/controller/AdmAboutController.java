package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/about")
public class AdmAboutController {
	
	final String path = "admin/about";
	
	@GetMapping("/")
	String list() {
		
		return path + "view";
	}
	
	@PostMapping("/about")
	String modify() {
		
		return "rediect:..";
	}
	
}
