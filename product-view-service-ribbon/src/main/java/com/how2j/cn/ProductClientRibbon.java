package com.how2j.cn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

    public List<Product> list(){
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }
}
