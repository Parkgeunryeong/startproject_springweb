package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/space")
	public String space() {
		return "space";
	}
	
	
	

}
