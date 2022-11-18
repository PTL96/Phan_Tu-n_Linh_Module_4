package com.codeGym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codeGym.service.IConvertService;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class ConvertUsdController {
    @Autowired
    IConvertService iConvertService;

@RequestMapping("")
public String showForm () {
    return "form_convert";
}
@PostMapping("/result")
    public String result(@RequestParam("usd") int usd, @RequestParam int rate, Model model){
    model.addAttribute("result",iConvertService.result(usd, rate));
    model.addAttribute("usd",usd);
    model.addAttribute("rate",rate);
    return "form_convert";
}
}



