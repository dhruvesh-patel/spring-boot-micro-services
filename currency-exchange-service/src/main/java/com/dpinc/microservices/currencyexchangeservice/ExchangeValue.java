package com.dpinc.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class ExchangeValue {

	@Id
	private Long id;
	
    @Column(name="CCY_FROM")
	private String from;
	
    @Column(name="CCY_TO")
	private String to;
	
    @Column(name="CONVERSION_MULTIPLE")
	private BigDecimal conversionMultiple;
	
		
}
