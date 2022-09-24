package com.edu.ltech.controller.admin;

import com.edu.ltech.entity.Product;
import com.edu.ltech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    ProductService productService;

    @GetMapping("/home/index")
    public String index(Model model){
        List<Product> list = productService.findAll();
        model.addAttribute("products" , list);
        return "views/admin/index";
    }
}
