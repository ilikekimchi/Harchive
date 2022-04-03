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
	
	@GetMapping("/add")	// �ۼ� ������ 
	String add() {
		
		return path + "add";
	}
	
	@PostMapping("/add") // �ۼ�
	String add() {
		
		return "redirect:list";
	}
	
	@GetMapping("/update") // ���� ������
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
