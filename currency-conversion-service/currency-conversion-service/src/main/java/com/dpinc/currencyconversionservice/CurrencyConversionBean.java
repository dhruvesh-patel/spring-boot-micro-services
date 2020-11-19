package com.dpinc.currencyconversionservice;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CurrencyConversionBean {

	  private Long id;
	  private String from;
	  private String to;
	  private BigDecimal conversionMultiple;
	  private BigDecimal quantity;
	  private BigDecimal totalCalculatedAmount;
		  
}
