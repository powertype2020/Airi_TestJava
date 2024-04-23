package com.example.airi_javaTest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Hello {
    @RequestMapping({ "/", "/index" })
    @ResponseBody
    public String get() {
        return "Hello World";
    }
}