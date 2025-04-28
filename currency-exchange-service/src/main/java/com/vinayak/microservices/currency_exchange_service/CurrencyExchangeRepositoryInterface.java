package com.vinayak.microservices.currency_exchange_service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepositoryInterface extends JpaRepository<CurrencyExchange, Long> {

	CurrencyExchange findByFromAndTo(String from, String to);
	
}
