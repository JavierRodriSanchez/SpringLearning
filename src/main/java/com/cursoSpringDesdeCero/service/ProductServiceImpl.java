package com.cursoSpringDesdeCero.service;

import com.cursoSpringDesdeCero.entities.Product;
import com.cursoSpringDesdeCero.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductsRepository productsRepository;


    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findProduct(Long id) {
        return null;
    }

    @Override
    public void create(Product product) {

    }
}
