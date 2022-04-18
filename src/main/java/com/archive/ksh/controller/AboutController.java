package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutController {
	
	final String path = "about/";
	
	@GetMapping("")
	String getPage() {
		
		return path + "about";
	}
	
	@GetMapping("/modify")
	String getAboutModify() {
		
		return path + "modify";
	}
	
	@PostMapping("/modify")
	String postAboutModify() {
		
		return ""; // 뒤로가기
	}
	
	
}
