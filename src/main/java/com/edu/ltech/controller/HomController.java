package com.edu.ltech.controller;

import com.edu.ltech.entity.Category;
import com.edu.ltech.entity.Product;
import com.edu.ltech.service.CategoryService;
import com.edu.ltech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@Controller
public class HomController extends HttpServlet {
    List<Product> pList;
    List<Category> cList;

    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;

    @RequestMapping({"/","/home/index"})
    public String index(Model model){
        pList = productService.findAll();
        cList  = categoryService.findAll();
        model.addAttribute("items", pList);
        model.addAttribute("categories", cList);
        model.addAttribute("check","");
        return "views/user/products";
    }

    @GetMapping("/category={cid}")
    public String ListProByCid(Model model, @PathVariable("cid")  String cid){
        pList = productService.findByCategoryId(cid);
        cList  = categoryService.findAll();
        model.addAttribute("check",cid);
        model.addAttribute("items", pList);
        model.addAttribute("categories", cList);
        return "views/user/products";
    }

    @GetMapping("/{id}")
    public String proDetail(Model model, @PathVariable("id") int id){
        Product product = productService.findById(id);
        model.addAttribute("item", product);

        return "views/user/product-detail";
    }
}
