package com.zf.demo4jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class JSPController {

    @RequestMapping("/hello")
    public String hello(Model model){

        model.addAttribute("now",DateFormat.getDateInstance().format(new Date()));
        return "hello";
    }
}
