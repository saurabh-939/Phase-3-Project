package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Welcome";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hello, i was protected";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Welcome from admin";
    }

}
