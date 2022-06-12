package com.zyn.pumpkinmarket.controller;

import com.zyn.pumpkinmarket.utils.Resp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    @ResponseBody
    public Resp helloWorld() {
        return Resp.ok("hello world!");
    }
}
