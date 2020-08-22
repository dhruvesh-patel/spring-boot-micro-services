package com.dpinc.microservices.currencyexchangeservice;

import java.math.BigDecimal;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class CurrencyExchangeController {

		
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue
		(@PathVariable String from, @PathVariable String to){
		
		ExchangeValue exchangeValue = new ExchangeValue();
		exchangeValue.setId(1L);
		exchangeValue.setFrom(from);
		exchangeValue.setTo(to);
		exchangeValue.setConversionMultiple(BigDecimal.valueOf(1.5));
				
				
		log.info("The Exchange value from {} to {} conversion is {}", from, to, exchangeValue.getConversionMultiple());
		log.info("Exchange value : " + exchangeValue);
		
		
		return exchangeValue;
	}
	
}
