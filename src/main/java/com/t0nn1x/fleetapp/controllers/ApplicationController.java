package com.t0nn1x.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    
    @GetMapping("/home")
    public String goHome(){
        return "index";
    }

}
