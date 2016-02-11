package com.trinet.audit;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.trinet.audit")
@EnableAutoConfiguration
/**
 *  Spring Boot Application for Audit Trail
 *
 */
public class AuditApplication {

	    private static Logger LOGGER  =  Logger.getLogger(AuditApplication.class);
	    
		public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AuditApplication.class, args);
		
		String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
        	LOGGER.info("bean Names :: "+beanName);
        }

	
	}

}
