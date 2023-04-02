package com.company.service;

import com.company.entity.Product;
import com.company.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> saveAll(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public Product findById(long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findByProductName(String name) {
        return productRepository.findByProductName(name).orElse(null);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductQuantity(product.getProductQuantity());
        existingProduct.setProductPrice(product.getProductPrice());
        return productRepository.save(existingProduct);
    }

    public String deleteById(long id) {
        productRepository.deleteById(id);
        return "product with id : " + id + " removed";
    }

    public List<Product> deleteByProductName(String name) {
        return productRepository.deleteByProductName(name).orElse(null);
    }

    public String deleteAll() {
        productRepository.deleteAll();
        return "all products deleted";
    }
}
