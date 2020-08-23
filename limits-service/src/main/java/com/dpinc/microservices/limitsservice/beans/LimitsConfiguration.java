package com.dpinc.microservices.limitsservice.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LimitsConfiguration {

	private int maximum;
	private int minimum;
		
}
