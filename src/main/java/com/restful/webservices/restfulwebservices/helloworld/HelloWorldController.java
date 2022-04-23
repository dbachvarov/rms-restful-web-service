package com.restful.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by danielbachvarov on 23/04/2022
 */
@RestController
public class HelloWorldController {
    @RequestMapping
    public String helloWorld(){
        return "Hello Dummy!";
    }
}
