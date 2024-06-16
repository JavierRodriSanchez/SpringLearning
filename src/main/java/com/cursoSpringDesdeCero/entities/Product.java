package com.cursoSpringDesdeCero.entities;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "productos")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;

private Long price;
    
}
