package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {

	@ResponseBody
	@RequestMapping("/suger")
	public String giveSuger() {
		
		return "here is your sugar... ";
	}
}
