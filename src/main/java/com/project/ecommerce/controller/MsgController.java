package com.project.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class MsgController {

	
	@GetMapping("/ajay")
	public String showMsg () {
		return "hello";
	}
}
