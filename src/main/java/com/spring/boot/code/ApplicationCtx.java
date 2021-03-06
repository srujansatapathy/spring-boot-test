package com.spring.boot.code;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationCtx {
	
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ApplicationCtx.class, args);
        
        System.out.println("Beans provided by Spring Boot");
        
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
