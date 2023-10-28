package com.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@GetMapping("/welcome")
	public String greeting() {
		String entring = "entringpoint";

		Integer sum = 10;

		logger.error("this method is...." + entring);

		logger.info("this is the final sum...." +sum);

		System.out.println("this is the logging ");

		String exit = "exitpoint";

		logger.error("this method is...." + exit);

		return "Welcome to the Bikkad IT";
	}

}
