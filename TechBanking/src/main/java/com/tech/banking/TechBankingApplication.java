package com.tech.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages= {"com.tech.banking.dao.CustomerDao"})
@ComponentScan({ "com.tech.banking.controller", "com.tech.banking.dao", "com.tech.banking.model", "com.tech.banking.repository" }) 
public class TechBankingApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(TechBankingApplication.class, args);
	}
	
	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(TechBankingApplication.class);
	    }

}
