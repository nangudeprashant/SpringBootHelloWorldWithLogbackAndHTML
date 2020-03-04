package com.javaLive.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldWithJspApplication {
	private static final Logger LOGGER=LoggerFactory.getLogger(SpringBootHelloWorldWithJspApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldWithJspApplication.class, args);
		LOGGER.info("=========This is info level log message.===================");
		LOGGER.trace("=========This is trace level log message.===================");
        LOGGER.debug("=========This is debug level log message.===================");
       // LOGGER.info("doStuff took input - {}", 3);
        LOGGER.warn("=========This is warn level log message.===================");
        LOGGER.error("=========This is error level log message.===================");
	}

}
