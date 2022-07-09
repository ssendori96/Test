package com.oracle.oBootTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String main() {
		System.out.println("MainController main Start...");
		
		return "main";
	}
	
	
}
