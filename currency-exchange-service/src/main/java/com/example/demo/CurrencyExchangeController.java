package com.example.demo;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	// this object will be used for logging in console.
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Environment environment;
	
	@Autowired
	ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(
			@PathVariable String from,
			@PathVariable String to
			) {
		
		ExchangeValue exchangeValue= repository.findByFromAndTo(from, to);
		// this is logging, it will help us trace the information in console logs
		logger.info("{}",exchangeValue);
		
		return exchangeValue;
		
	}
	
	
}
