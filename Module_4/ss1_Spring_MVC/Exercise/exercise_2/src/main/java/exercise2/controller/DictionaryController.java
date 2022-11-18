package exercise2.controller;

import exercise2.servicce.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    @Autowired
    IDictionaryService iDictionaryService;
    @RequestMapping("")
    public String showForm(){
      return "search";
    }
    @PostMapping("dictionary")
    public String result(@RequestParam String tiengAnh, Model model){
        model.addAttribute("ketQua",iDictionaryService.tiengViet(tiengAnh));
        return "search";
    }


}
