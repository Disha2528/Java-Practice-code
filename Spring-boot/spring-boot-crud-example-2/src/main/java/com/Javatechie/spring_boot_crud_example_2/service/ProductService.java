package com.Javatechie.spring_boot_crud_example_2.service;


import com.Javatechie.spring_boot_crud_example_2.entity.Product;
import com.Javatechie.spring_boot_crud_example_2.repository.ProductRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

    
}
