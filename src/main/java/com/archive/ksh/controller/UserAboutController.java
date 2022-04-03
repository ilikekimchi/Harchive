package com.archive.ksh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user/about")
public class UserAboutController {
	
	@GetMapping("/")
	String getView() {
		
		return "";
	}
	
}
