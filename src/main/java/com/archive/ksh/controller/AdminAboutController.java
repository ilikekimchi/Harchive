package com.archive.ksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminAboutController {

	@GetMapping("/admin/about")
	String aboutPageReq() {
		
		return "";
	}
	
	@PostMapping("/admin/about/modify")
	String aboutModify() {
		
		return ""; // �ڷΰ��� Ȥ�� void�� �س��� 
	}
	
	
}
