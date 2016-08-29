package com.spring.boot.code;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
    @RequestMapping("/")
    public String homePage() {
        return "HomePage :) ";
    }

}
