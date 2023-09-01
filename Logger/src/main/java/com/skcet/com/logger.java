package com.skcet.com;

import java.lang.ModuleLayer.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class logger {
	org.slf4j.Logger logger = LoggerFactory.getLogger(Controller.class);
	@GetMapping("/test")
	public String hello()
	{
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");
		return "Hello Scaler";
	}

}
