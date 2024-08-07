package com.shavez.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping("/sample")
	public String message()
	{
		return "hello welcome";
	}
}
