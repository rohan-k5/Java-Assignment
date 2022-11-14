package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {

	Logger logger = LoggerFactory.getLogger(HelloWorldService.class);
	@RequestMapping("/")
	public String test() {
		logger.trace("A Trace Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARNING Message");
		logger.error("An ERROR Message");
		
		return "Hello  ";
	}
}
