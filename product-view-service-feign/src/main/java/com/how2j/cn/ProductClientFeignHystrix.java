package com.how2j.cn;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFeignHystrix implements ProductFeign{
    @Override
    public List<Product> list() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0,"此产品微服务不可用",0));
        return result;
    }
}
