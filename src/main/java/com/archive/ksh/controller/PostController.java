package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.archive.ksh.model.Post;

@Controller
@RequestMapping("/post")
public class PostController {
	
	final String path = "post/";
	
	@GetMapping("/view") // user
	String getPostView() {
		
		return "view";
	}
	
	@GetMapping("")
	String postList() {
		
		return path + "list";
	}
	
	@GetMapping("/add")
	String postAdd() {
		
		return path + "add";
	}
	
	@PostMapping("/add")
	String postAdd(Post post) {
		
		return ""; // page reload (js:location.reload())
	}
	
	@GetMapping("/modify")
	String postModify(Post post) {
		
		return path + "modify";
	}
	
	@PostMapping("/modify") 
	String postModify(Model model) {
			
		return ""; // 뒤로가기
	}
	
	@GetMapping("/delete")
	String postDelete(Post post) {
		
		return "";	// 페이지 리로딩
	}
	
	
}
