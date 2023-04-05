package com.zyn.pumpkinmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/home")
    public String toHome() {
        return "home";
    }

    @RequestMapping("/pdf")
    public String toPdf() {
        return "pdf";
    }

    @RequestMapping("/fileList")
    public String toFileList() {
        return "fileList";
    }

    @RequestMapping("/folder")
    public String toFolder() {
        return "folder";
    }
}
