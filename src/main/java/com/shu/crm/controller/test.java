package com.shu.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@Controller
public class test {

    @RequestMapping("/test")
    public String test(){

        System.out.println("11");
        return "login";
    }
}
