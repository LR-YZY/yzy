package com.hnguigu.controller;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class controller {

    @GetMapping("/test1")
    @ResponseBody
    public String test1(){
        return "test1";
    }

    @GetMapping("/test2")
    @ResponseBody
    public String test2(){
        return "ss";
    }

}
