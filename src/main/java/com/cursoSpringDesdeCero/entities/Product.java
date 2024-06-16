package com.cursoSpringDesdeCero.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "productos")
public class Product implements Cloneable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;

private Long price;

    @Override
    protected Object clone(){

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return  new Product(this.id,this.name,this.price);
        }
    }
}
