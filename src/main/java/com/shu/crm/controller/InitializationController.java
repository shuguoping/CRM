package com.shu.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@Controller
public class InitializationController {

    @RequestMapping("/")
    public String test() {

        return "login";
    }

    @RequestMapping("/Jump")
    public String Jump(@RequestParam("Jump") String Jump) {
        return Jump;
    }


}
