package com.demo.article.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {


    @GetMapping("hello")
    public String sayHello() {
        return "Hello from article microservice";
    }

}
