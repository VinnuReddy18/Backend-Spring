package com.scaler.vinay.productservicesst.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Long id;
    private String title;
    private String description;
    private double price;
    private Category category;
    private String image;
    
//    public Product(Long id, String title, String description, double price, Category category, String image) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//        this.price = price;
//        this.category = category;
//        this.image = image;
//    }

}