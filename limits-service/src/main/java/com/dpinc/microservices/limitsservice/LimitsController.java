package com.dpinc.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dpinc.microservices.limitsservice.beans.LimitsConfiguration;

@RestController
public class LimitsController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsConfiguration(){
		return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
