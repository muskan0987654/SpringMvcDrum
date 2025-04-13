package com.drum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v2/")
public class NewController {

	@RequestMapping("/")
	public String getResponse() {
		System.out.println("Welcome NewController");
		return "welcome";
	}
	
	@RequestMapping("/login")
	public String loginResponse() {
		System.out.println("Welcome login NewController");
		return "profile";
	}
}
