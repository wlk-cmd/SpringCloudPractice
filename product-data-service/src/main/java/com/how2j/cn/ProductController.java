package com.how2j.cn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProduvtService produvtService;

    @RequestMapping("/products")
    public Object products(){
        List<Product> list = produvtService.list();
        return list;
    }
}
