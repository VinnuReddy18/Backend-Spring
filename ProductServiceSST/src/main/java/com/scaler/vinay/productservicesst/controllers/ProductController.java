package com.scaler.vinay.productservicesst.controllers;

import com.scaler.vinay.productservicesst.dtos.FakeStoreProductDto;
import com.scaler.vinay.productservicesst.models.Product;
import com.scaler.vinay.productservicesst.services.FakeStoreProductService;
import com.scaler.vinay.productservicesst.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//can able to host HTTP api's
@RestController
@RequestMapping("/products")
public class ProductController { //used by user to communicate to server
    private ProductService productService;
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
return productService.getProductById(id);
    }

@GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}