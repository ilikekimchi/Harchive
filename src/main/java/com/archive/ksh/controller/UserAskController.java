package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ask")
public class UserAskController {
	
	@GetMapping("/")
	String askList() {
		
		return "ask/list";
	}
	
	@PostMapping("/answer") 
	String commentAdd() {
		
		return ""; // ¸®·Îµå
	}
	
	
}
