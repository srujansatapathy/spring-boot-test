package com.spring.boot.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
    @RequestMapping("/")
    public String index() {
        return "My First Spring boot Application";
    }

}
