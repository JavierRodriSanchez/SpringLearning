package com.cursoSpringDesdeCero.service;

import com.cursoSpringDesdeCero.entities.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();

    public Product findProduct(Long id);

    public void create (Product product);


}
