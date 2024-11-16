package com.Automationawsproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Awscontroller {
	
	@GetMapping(value="/getvalue")
	public String getString(String a) {
		return "hello World";
	}

}
