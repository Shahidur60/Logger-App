package com.example.testlogger;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello(String name) {
        System.out.println("Hello, " + name + "!");
        return "Hello, " + name + "!";
    }
}
