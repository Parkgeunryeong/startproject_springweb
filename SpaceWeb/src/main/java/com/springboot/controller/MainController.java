package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	@GetMapping("/sky")
	public String sky() {
		return "sky";
	}
	@GetMapping("/sky2")
	public String sky2() {
		return "sky2";
	}
	
	@GetMapping("/scorehome")
	public String scorehome() {
		return "score_home";
	}
	@GetMapping("/weather")
	public String weather() {
		return "weather";
	}
	@GetMapping("/search")
	public String search() {
		 
	     return "search"; 
	}
	
	
	
	
	
	
	

}
