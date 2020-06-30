package com.how2j.cn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduvtService {

    @Value("${server.port}")
    String port;

    public List<Product> list(){
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1,"product a from port:"+port, 50));
        ps.add(new Product(1,"product a from port:"+port, 150));
        ps.add(new Product(1,"product a from port:"+port, 250));
        return ps;
    }
}
