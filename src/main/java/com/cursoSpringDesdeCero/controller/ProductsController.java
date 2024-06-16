package com.cursoSpringDesdeCero.controller;

import com.cursoSpringDesdeCero.entities.Product;
import com.cursoSpringDesdeCero.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @Autowired
    ProductService productService;

    @GetMapping("/findAll")
    public List<Product> findAll(){

        return productService.findAll();

    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<?> findById(@PathVariable("id")Long id ){

        return ResponseEntity.ok(productService.findProduct(id));
    }

    @PostMapping("/add")
    public ResponseEntity<?> create(@RequestBody Product product){
        productService.create(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }


}
