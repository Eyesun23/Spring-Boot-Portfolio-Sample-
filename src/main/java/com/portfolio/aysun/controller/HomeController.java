package com.portfolio.aysun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/me")
	public String about(){
	    return "about.html";
	}
	
	@RequestMapping("/proj")
	public String projects(){
	    return "projects.html";
	}

}
