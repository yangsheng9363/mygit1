package com.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/demoTest")
public class DemoController {


    @RequestMapping(value = "/toIndex")
    public String toIndex(){
        System.out.println(121111);
        return "index";
    }


}
