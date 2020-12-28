package com.zg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customer")
public class indexController {
@RequestMapping("/cu")
@ResponseBody
public String cu(){

    return "hello java Spring sdasd mvc";
}
}
