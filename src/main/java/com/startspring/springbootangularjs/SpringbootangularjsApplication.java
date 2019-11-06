package com.startspring.springbootangularjs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootangularjsApplication {

    private static final Logger log = LogManager.getLogger(SpringbootangularjsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootangularjsApplication.class, args);
        log.warn("Program may crash!");

        log.info("The program worked successfully");
    }

}
