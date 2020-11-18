package com.dpinc.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class CurrencyExchangeController {

	@Autowired
	ExchangeValueRepository exchangeRepository;	
	
		
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
		
		ExchangeValue exchangeValue = exchangeRepository.findByFromAndTo(from, to);
				
		log.info("The Exchange value from {} to {} conversion is {}", from, to, exchangeValue.getConversionMultiple());
		log.info("Exchange value : " + exchangeValue);
		
		return exchangeValue;
	}
	
}
