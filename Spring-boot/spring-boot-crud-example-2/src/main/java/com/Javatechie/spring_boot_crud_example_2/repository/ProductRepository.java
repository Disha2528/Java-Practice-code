package com.Javatechie.spring_boot_crud_example_2.repository;

import com.Javatechie.spring_boot_crud_example_2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
