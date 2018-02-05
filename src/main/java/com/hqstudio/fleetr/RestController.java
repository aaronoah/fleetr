package com.hqstudio.fleetr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController: Description
 * Copyright &copy; 2016, AaronZhao
 *
 * @author Aaron Zhao
 * @version 1.0.0
 * email: aaron.elite1993@gmail.com
 */

@RestController
public class RESTController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello Spring Boot";
    }

}