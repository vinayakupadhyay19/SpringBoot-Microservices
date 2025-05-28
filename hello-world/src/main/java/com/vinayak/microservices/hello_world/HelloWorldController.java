package com.vinayak.microservices.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String getHelloWorld() {
		return "{\"message\" : \"Hello World Java : Vinayak Upadhayay v1\"}";
	}
}
