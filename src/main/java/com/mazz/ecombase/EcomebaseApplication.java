package com.mazz.ecombase;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



//@Configuration
//@EntityScan(basePackageClasses = JpaConfiguration.class)
//@ComponentScan({"com.mazz.ecombase.entity","com.mazz.ecombase.repository"})
//@EntityScan("com.mazz.ecombase.entity")
//@EntityScan( basePackages = {"com.mazz.ecombase.entity"} )

//@Configuration
//@EnableJpaRepositories("com.mazz.ecombase.repository")
//@EnableAutoConfiguration
//@EntityScan("com.mazz.ecombase.entity")



//@EntityScan("com.mazz.ecombase.entity")
//@EnableJpaRepositories("com.mazz.ecombase.repository")
@EnableJpaAuditing
@SpringBootApplication
public class EcomebaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomebaseApplication.class, args);
	}

}

