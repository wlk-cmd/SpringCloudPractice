package com.how2j.cn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductService {
    @Resource
    ProductFeign productFeign;

    public List<Product> list(){
        return productFeign.list();
    }
}
