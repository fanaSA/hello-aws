package com.github.fana;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

    @GetMapping
    public String greet(){
        return "Hello World!";
    }
    
    @GetMapping("{name}")
    public String greetByName(@RequestParam("name") String name){
        System.out.println("Name as: " + name);
        return "Hello, " + name + "!";
    }
}
