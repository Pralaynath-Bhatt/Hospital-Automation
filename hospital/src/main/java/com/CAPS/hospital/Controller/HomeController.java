package com.CAPS.hospital.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String HomePage(){
        return "Welcome Home";
    }

    @GetMapping("/ii")
    public String ErrorPage(){
        return "Welcome Error";
    }

    @GetMapping("/check")
    public String CheckPage(){
        return "Welcome horror";
    }
}
