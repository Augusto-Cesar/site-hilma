package com.hilma.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class menuController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/links")
	public String links() {
		return "links";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
}
