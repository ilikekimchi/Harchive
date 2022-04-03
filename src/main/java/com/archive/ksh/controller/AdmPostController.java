package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/post")
public class AdmPostController {

	final String path = "admin/post/";
	
	@GetMapping("/")
	String PostList() {
		
		return path + "list";
	}
	
	@GetMapping("/add_page")
	String getAddPage() {
		
		return path + "add";
	}
	
	@PostMapping("/add")
	String postAdd() {
		
		return "";
	}
	
	@GetMapping("/update_page")
	String getModifyPage() {
		
		return path + "modify";
	}
	
	@PostMapping("/modify")
	String postModify() {
		
		return path + "modify";
	}
	
	@RequestMapping("/delete")
	String postDelete() {
		
		return "";
	}
	
}
