package com.sandwich;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
@GetMapping("/")
String getIndex(){
    return "index";
}
    @PostMapping("/save")
    public String save(@RequestParam("spice") String[] spice){
        return "/display";
    }
}
