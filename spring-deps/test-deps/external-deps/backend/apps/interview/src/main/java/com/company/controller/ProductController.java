package com.company.controller;

import com.company.entity.Product;
import com.company.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products/product")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @PostMapping("/products")
    public List<Product> saveAll(@RequestBody List<Product> products) {
        return productService.saveAll(products);
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable("id") long id) {
        return productService.findById(id);
    }

    @GetMapping("/products/productname/{name}")
    public List<Product> findByProductName(@PathVariable("name") String name) {
        return productService.findByProductName(name);
    }

    @GetMapping("/products")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/products/id/{id}")
    public String deleteById(@PathVariable("id") long id) {
        return productService.deleteById(id);
    }

    @DeleteMapping("/products/{name}")
    public List<Product> deleteByProductName(@PathVariable("name") String name) {
        return productService.deleteByProductName(name);
    }

    @DeleteMapping("/products")
    public String deleteAll() {
        return productService.deleteAll();
    }
}
