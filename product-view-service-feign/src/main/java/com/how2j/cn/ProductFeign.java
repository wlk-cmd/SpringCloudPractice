package com.how2j.cn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback =  ProductClientFeignHystrix.class)
public interface ProductFeign {

    @GetMapping("/products")
    public List<Product> list();
}
