package com.example.testlogger;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class TestClass {

    @RequestMapping(value = "/populate", method = RequestMethod.GET)
    public void testMethod1()
    {
        System.out.println("Test 1");
    }

    public void testMethod2()
    {
        System.out.println("Test 2");
    }

    public void testMethod3()
    {
        System.out.println("Test 3");
    }
}
