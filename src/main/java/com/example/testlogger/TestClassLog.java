package com.example.testlogger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class TestClassLog {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMethod1()
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(5) + 1;

        if(randomNumber < 3 )
        {
            return helloService.sayHello("Himel");
        } else if (randomNumber >= 3 && randomNumber < 5) {
            return testMethod2();
        } else {
            return testMethod2();
        }

    }

    public String testMethod2()
    {
        return "test 2";
    }


}
