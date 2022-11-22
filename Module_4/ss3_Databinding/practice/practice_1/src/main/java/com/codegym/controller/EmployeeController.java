package com.codegym.controller;
import com.codegym.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
    @RequestMapping("/")
    public String getIndex() {
        return "info";
    }

    @GetMapping("/create")
    public String showForm(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "create";
    }
    @PostMapping("/info")
    public String submit(@ModelAttribute("employee") Employee employee, ModelMap model){
model.addAttribute("name", employee.getName());
model.addAttribute("contactNumber", employee.getContactNumber());
model.addAttribute("id", employee.getId());
return "info";
    }
}
