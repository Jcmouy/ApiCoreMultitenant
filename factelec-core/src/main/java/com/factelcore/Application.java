package com.factelcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.factelcore.*", "uy.com.antel.*"})
@EnableJpaRepositories("com.factelcore.repository")
public class Application extends SpringBootServletInitializer {
		
    public static void main(String[] args){
    	SpringApplication.run(Application.class,args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
 
    private static Class<Application> applicationClass = Application.class;
    
}
