package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class SimpleController {

	@RequestMapping("/hello")
	public String Hello() {
		return "Hello from springboot!!";
		
	}
}
