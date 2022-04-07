package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/post")
public class AdminPostController {
	
	final String path = "post/admin/";
	
	// list print + delete request, add page, add request, modify request
	
	@GetMapping("/list")
	String postList() {
		
		return path + "list";
	}
	
	@GetMapping("/add")
	String addPageReq() {
		
		return path + "add";
	}
	
	@PostMapping("/add")
	String postAdd() {
		
		return ""; // �ڷΰ���
	}
	
	@GetMapping("/modify")
	String modifyPageReq() {
		
		return path + "modify";
	}
	
	@PostMapping("/modify") 
	String postModify() {
			
		return ""; // �ڷΰ���
	}
	
	@GetMapping("/delete")
	String postDelete() {
		
		return "";	// ������ ���ε�
	}
	
	
}
