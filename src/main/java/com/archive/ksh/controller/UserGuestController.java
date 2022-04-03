package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserGuestController {

	final String path = "user/guest/";
	
	@GetMapping("/")
	String getList() {
		
		return path + "view";
	}
	
	@PostMapping("/comment_add") 
	String commentAdd() {
		
		return "";
	}
	
	@GetMapping("/comment_delete")
	String commentDelete() {
		
		return "";
	}
	
	
	
	
}
