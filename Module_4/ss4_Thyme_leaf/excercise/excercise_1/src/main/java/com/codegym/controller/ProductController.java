package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping("")
    public String index(Model model) {
        List<Product> productList = productService.displayAll();
        model.addAttribute("product", productList);
        return "home";
    }

    @GetMapping("addForm")
    public String add( Model model) {
        model.addAttribute("product", new Product());
        return "addForm";
    }
    @GetMapping("{id}/updateForm")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "updateForm";
    }
@PostMapping("update")
public String edit(Product product){
        productService.edit(product.getId(),product);
        return "redirect:/";
}
@PostMapping("save")
    public String save(Product product){
        product.setId((int)(Math.random()*10000));
        product.save(product);
        return ("redirect:/");
}

}
