package com.springboot.studyjongseong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping({"/", "/index"})
	public String indexPage() {
		return "index";
	}
}
