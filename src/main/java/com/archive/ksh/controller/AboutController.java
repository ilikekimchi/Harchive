package com.archive.ksh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.archive.ksh.model.About;
import com.archive.ksh.service.AboutService;

@Controller
@RequestMapping("/about")
public class AboutController {
	
	@Autowired
	AboutService service;
	
	final String path = "about/";
	
	@GetMapping("")
	String getPage(Model model) {
		System.out.println("예아 여기는 겟 페이지. 이라샤이 마세");
		About item = service.getInfo();
		model.addAttribute("info", item);
		return path + "about";
	}
	
	@GetMapping("/modify")
	String getAboutModify(Model model) {
		System.out.println("예아 여기는 수정페이지 겟도다제.");
		About item = service.getInfo();
		model.addAttribute("info", item);		
		return path + "modify";
	}
	
	@PostMapping("/modify")
	String postAboutModify(About item) {
		System.out.println("예아 여기는 수정정보 포스트 리쿠에스트.");
		service.modify(item);
		return "redirect:."; // page reload or back
	}
	
	
}
