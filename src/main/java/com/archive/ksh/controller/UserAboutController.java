package com.archive.ksh.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserAboutController {
	
	@GetMapping("/about")
	String getView() {
		
		return "/about/about";
	}
	
	
}
