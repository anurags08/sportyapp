package com.simpilearn.workshop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	
	
	// @GetMapping("/index")
	public String home() {
		return "index";
	}
	// @GetMapping("/payment")
	public String payment() {
		return "payment";
	}
	
	// @GetMapping("/homepage")
	public String homepage() {
		return "homepage";
	}
}
