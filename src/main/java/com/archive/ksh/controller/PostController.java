package com.archive.ksh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.archive.ksh.model.Post;
import com.archive.ksh.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	PostService service;
	
	final String path = "post/";
		
	@GetMapping("/view") // user - post detail view
	String getPostView(int postNum, Model model) {
		Post item = service.getPostInfo(postNum);
		model.addAttribute("postInfo", item);
		return ""; // modal
	}
	
	@GetMapping("/list")
	String postList(Model model) {	// admin - list page
		List<Post> list = service.postList();
		model.addAttribute("postList", list);
		return path + "list";
	}
	
	@GetMapping("/add")
	String postAdd() {	// admin - add page 
		
		return path + "add";
	}
	
	@PostMapping("/add")
	String postAdd(Post item) {	// admin - post add
		service.postAdd(item);
		return ""; // page reload (js:location.reload())
	}
	
	@GetMapping("/modify")
	String postModify(int postNum, Model model) {	// admin - modify page 
		Post item = service.getPostInfo(postNum);
		model.addAttribute("postInfo", item);
		return path + "modify";
	}
	
	@PostMapping("/modify") 
	String postModify(Post item) {	// admin - modify request 
		service.postModify(item);
		return ""; 
	}
	
	@GetMapping("/delete")
	String postDelete(Post item) {	// admin - post delete request
		
		return "";
	}
	
	
}
