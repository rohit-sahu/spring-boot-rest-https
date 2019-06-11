package com.rohit.springbootrest.restController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	public static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping(value = "/")
	public String home() {
		logger.info("Home has been called............../");
		return "Hello World!";
	}
}
