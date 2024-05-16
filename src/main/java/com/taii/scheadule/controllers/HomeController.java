package com.taii.scheadule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    
    @GetMapping("/") //isso aqui define a rota para onde vou ir
    public String index(){
        return "home/index.html";
    }
}
