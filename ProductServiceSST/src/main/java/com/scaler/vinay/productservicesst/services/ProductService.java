package com.scaler.vinay.productservicesst.services;

import com.scaler.vinay.productservicesst.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
}
