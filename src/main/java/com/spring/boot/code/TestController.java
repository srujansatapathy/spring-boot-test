package com.spring.boot.code;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
    @RequestMapping("/")
    public String index() {
        return "My First Spring boot Application";
    }

}
