package com.cursoSpringDesdeCero.entities;

import jakarta.persistence.Entity;
import lombok.Data;
@Entity
@Data
public class Product {

private Long id;

private String name;

private Long price;
    
}
