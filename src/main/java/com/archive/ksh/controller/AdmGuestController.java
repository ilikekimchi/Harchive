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
	String guestList() {
		
		return path + "list";
	}
	
	@PostMapping("/reply_add")
	String replyAdd() { 
		
		return "redirect:..";
	}
	
	@GetMapping("/reply_delete")
	String replyDelete() {
		
		return "return:..";
	}
	
	@GetMapping("/comment_delete")
	String commentDelete() {
		
		return "redirect:..";
	}
	
}