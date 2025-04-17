package com.drum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/")
public class WelcomeController {

	@RequestMapping("/")
	@ResponseBody
	public String getResponse() {
		System.out.println("Welcome controller");
		return "Hey, this is the example of response body annotation";
	}
	
	@RequestMapping("/login")
	public String loginResponse() {
		System.out.println("Welcome login controller");
		return "hello";
	}
	
	@RequestMapping("/user")
	public String userResponse(@RequestParam("user") String userName, @RequestParam("pass") String password, Model m ) {
		System.out.println("User Name is: " +userName);
		System.out.println("User Password is: " +password);
		System.out.println("Welcome login controller");
		
		String str="Hello " +userName+"Now this page is all yours.";
		
		m.addAttribute("msg", str);
		
		return "profile";
	}
}
