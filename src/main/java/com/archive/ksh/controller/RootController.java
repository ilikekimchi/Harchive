package com.archive.ksh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RootController {

	

	@RequestMapping("/")
	String main(Model model) {
		
		return "/main";
	}

	@RequestMapping("/admin")
	String accessList() {

		return "/admin";
	}

}
