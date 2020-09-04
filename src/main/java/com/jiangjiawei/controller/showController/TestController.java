package com.jiangjiawei.controller.showController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/aboutMe")
    public String aboutMe(){
        return "aboutMe";
    }
}
