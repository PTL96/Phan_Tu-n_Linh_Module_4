package com.codegym.controller;

import com.codegym.model.MailBox;
import com.codegym.service.IMailBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("")
public class MailBoxController {
    @Autowired
    IMailBoxService iMailBoxService;

    @GetMapping("/")
    public String getIndex(Model model) {
        List<String> languageList= iMailBoxService.collectLanguage();
        List<String> pageList = iMailBoxService.collectPage();
        model.addAttribute("languageList",languageList);
        model.addAttribute("pageList",pageList);
        model.addAttribute("mailBox", new MailBox());
        return "home";
    }

    @PostMapping("/save")
   public String add(@ModelAttribute MailBox mailBox, Model model){
        model.addAttribute("mailBox",mailBox);
        return "display";
    }
}
