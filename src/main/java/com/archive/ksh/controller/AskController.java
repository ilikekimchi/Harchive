package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ask")
public class AskController {
	
	final String path = "ask/"; 
	
	@GetMapping("/ask")	
	String askList() {	// get user page
		
		return path + "ask";
	}
	
	@PostMapping("/question")
	String commentAdd() {	// user question
		
		return ""; // page reload (js:location.reload())
	}
	
	@GetMapping("admin_ask_list")
	String adminAskList() {	// admin ask list
		
		return "ask/list";
	}
	
	@PostMapping("/add")
	String answer() {	// admin answer
		
		return ""; // page reload (js:location.reload())
	}
	
	@GetMapping("/answer_delte")	// change DeleteMapping
	String answerDelete() {	// admin answer delete
		
		return ""; // page reload (js:location.reload())
	}
	
	@GetMapping("/question_delete")	// change DeleteMapping
	String questionDelete() {	// admin user question delete
		
		return ""; // page reload (js:location.reload())
	}
	
}
