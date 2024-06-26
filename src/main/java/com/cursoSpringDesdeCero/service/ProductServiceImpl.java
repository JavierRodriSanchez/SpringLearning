package com.cursoSpringDesdeCero.service;

import com.cursoSpringDesdeCero.entities.Product;
import com.cursoSpringDesdeCero.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
    ProductsRepository productsRepository;



    @Override
    public List<Product> findAll() {
        return productsRepository.findAll();
    }

    @Override
    public Product findProduct(Long id) {
        return productsRepository.findById(id).get();
    }

    @Override
    public void create(Product product) {


        productsRepository.save(product);
    }
}
