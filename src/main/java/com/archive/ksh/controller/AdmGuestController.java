package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/guest")
public class AdmGuestController {

	final String path = "admin/guest";
	
	@GetMapping("/")
	String list() {
		
		return path + "list";
	}
	
	@GetMapping("/delete")	// 댓글 추가
	String add() { 
		
		return "redirect:..";
	}
	
	@PostMapping("/delete")
	String delete() {
		
		return "return:..";
	}
	
	
	@PostMapping("/add")	// 답글 추가
	String commentAdd() {
		
		return "redirect:..";
	}
	
	@GetMapping("/delete")	// 답글 삭제
	String commentDelete() {
		
		return "redirect:..";
	}
	
}