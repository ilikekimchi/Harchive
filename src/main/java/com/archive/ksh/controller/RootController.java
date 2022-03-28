package com.archive.ksh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.archive.ksh.model.Board;
import com.archive.ksh.service.BoardService;

@Controller
public class RootController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/")
	String main(Model model) {
		List<Board> list = boardService.selectBoardList();
		
		model.addAttribute("resultList", list);
		
	 	return "main";
	}
}
