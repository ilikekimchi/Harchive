package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/post")
public class AdmPostController {

	final String path = "admin/post";
	
	@GetMapping("/")
	String list() {
		
		return path + "list";
	}
	
	@GetMapping("/add")	// 작성 페이지 
	String add() {
		
		return path + "add";
	}
	
	@PostMapping("/add") // 작성
	String add() {
		
		return "redirect:list";
	}
	
	@GetMapping("/update") // 수정 페이지
	String modify() {
		
		return path + "modify";
	}
	
	@PostMapping("")	//
	String modify() {
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	String delete() {
		
		return "redirect:..";
	}
	
}
