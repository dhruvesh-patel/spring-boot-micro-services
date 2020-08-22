package com.dpinc.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class ExchangeValue {

	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal conversionMultiple;
	
		
}
