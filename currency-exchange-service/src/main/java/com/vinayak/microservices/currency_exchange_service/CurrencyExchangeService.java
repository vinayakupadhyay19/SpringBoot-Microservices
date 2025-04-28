package com.vinayak.microservices.currency_exchange_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {
	
	@Autowired
	private CurrencyExchangeRepositoryInterface currencyInterface;

	public CurrencyExchange findByFromAndTo(String from, String to) {
		// TODO Auto-generated method stub
		from = from.toUpperCase();
		to = to.toUpperCase();
		return currencyInterface.findByFromAndTo(from,to);
		
	}
	
	

}
