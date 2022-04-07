package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/ask")
public class AdminAskController {

	final String path = "ask/admin";
	
	@GetMapping("/ask")
	String askList() {
		
		return path + "list";
	}
	
	@PostMapping("/add")
	String answer() {
		
		return ""; // ������ ���ε�
	}
	
	@GetMapping("/answer_delte")
	String answerDelete() {
		
		return ""; // ������ ���ε�
	}
	
	@GetMapping("/question_delete")
	String questionDelete() {
		
		return ""; // ������ ���ε�
	}
	
}
