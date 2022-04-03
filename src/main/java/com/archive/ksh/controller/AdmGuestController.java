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
	
	@GetMapping("/delete")	// ��� �߰�
	String add() { 
		
		return "redirect:..";
	}
	
	@PostMapping("/delete")
	String delete() {
		
		return "return:..";
	}
	
	
	@PostMapping("/add")	// ��� �߰�
	String commentAdd() {
		
		return "redirect:..";
	}
	
	@GetMapping("/delete")	// ��� ����
	String commentDelete() {
		
		return "redirect:..";
	}
	
}