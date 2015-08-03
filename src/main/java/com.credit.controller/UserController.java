package com.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by leo on 15/8/3.
 */
@Controller
@RequestMapping("/")
public class UserController {
    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
