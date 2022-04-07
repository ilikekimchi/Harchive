package com.archive.ksh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.archive.ksh.model.Board;
import com.archive.ksh.model.Item;
import com.archive.ksh.service.BoardService;

@Controller
public class RootController {
	
	@Autowired
	BoardService service;
	
	@RequestMapping("/")
	String main() {
		
		return "main";
	}
	

	@RequestMapping("/admin")
	String accessList() {
		
		return "admin";
	}
	
	
	/*
	@RequestMapping("/")
	String main(Model model) {
		List<Board> list = service.selectBoardList();
		
		model.addAttribute("resultList", list);
		
	 	return "user/main";
	}
	*/
	
	/*
	@PostMapping("/add")
	String add(Item item) {
		service.add(item);
		
		return "redirect:/";
	}
	*/
	
}
