package com.vinayak.microservices.currency_exchange_service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class CurrencyExchangeController {
	
	@Autowired
	private CurrencyExchangeService currencyService;
	
	@Autowired
	private Environment environment;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue( 
			@PathVariable String from ,
			@PathVariable String to){
		CurrencyExchange currencyExchange = currencyService.findByFromAndTo(from,to);
		String envProperty = environment.getProperty("local.server.port");
		currencyExchange.setEnvironment(envProperty);
		
		return currencyExchange;
		
	}
	
}

