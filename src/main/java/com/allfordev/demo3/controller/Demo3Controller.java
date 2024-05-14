package com.allfordev.demo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo3")
public class Demo3Controller {

    @RequestMapping("/asbo")
    public String hello() {
        return "Feck off world!";
    }

    @RequestMapping("/docker")
    public String helloDocker() {
        return "Docker dooberry!";
    }

    @RequestMapping("/*")
    public String entry() {
        return "Hello world from Spring boot project demo3";
    }
}
