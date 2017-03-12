package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RestExample {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String testMethod(){
		return "Hello This is my first cloud app!!!";
	}

}
