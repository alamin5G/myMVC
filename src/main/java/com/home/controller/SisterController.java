package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sister")
public class SisterController {

	
	@RequestMapping("/makeup")
	public String siter() {
		return "makeuppage";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String book() {
		
		return "MY MATH BOOK";
	}
	
	@ResponseBody
	@RequestMapping("/dress")
	public String myDress() {
		return "This is my dress. How I looks this?";
	}
}
