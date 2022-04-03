package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserPostController {

	final String path = "user/post/";
	
	@GetMapping("/view")
	String getPostView() {
		
		return path + "view";
	}
	
	
}
