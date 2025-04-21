package com.vinayak.microservices.limit_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinayak.microservices.limit_service.bean.Limit;
import com.vinayak.microservices.limit_service.config.Configuration;


@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;
	

	@GetMapping("/limits")
	public Limit retrieveLimits() {
		return new Limit(configuration.getMin(),configuration.getMax());
	}
}
