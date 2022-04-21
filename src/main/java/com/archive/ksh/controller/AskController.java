package com.archive.ksh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.archive.ksh.model.Ask;
import com.archive.ksh.service.AskService;

@Controller
@RequestMapping("/ask")
public class AskController {
	
	@Autowired
	AskService service;
	
	final String path = "ask/";
	
	@GetMapping("")	
	String askList(Model model) {	// user - list page 
		List<Ask> list = service.askList();
		model.addAttribute("askList", list);
		return path + "ask";
	}
	
	@PostMapping("/question")
	String questionAdd(Ask ask) {	// user - question add
		service.questionAdd(ask);
		return "redirect:/ask"; 
	}
		
	@GetMapping("/list")
	String adminAskList(Model model) {	//	admin - list page
		List<Ask> list = service.askList();
		model.addAttribute("askList", list);
		return "ask/list";
	}
	
	@PostMapping("/list/answer")
	String answer(Ask item) {	// admin - answer add
		service.answerAdd(item);
		return ""; // page reload (js:location.reload())
	}
	
	@GetMapping("{askNum}/question_delete")	// change DeleteMapping
	String questionDelete(@PathVariable int askNum) {	// admin - user question delete
		service.questionDelete(askNum);
		return "ask/list"; // page reload (js:location.reload())
	}
	
	@GetMapping("/answer_delte")	// change DeleteMapping
	String answerDelete(Ask item) {	// admin - answer delete
		
		return ""; // page reload (js:location.reload())
	}
	
}
