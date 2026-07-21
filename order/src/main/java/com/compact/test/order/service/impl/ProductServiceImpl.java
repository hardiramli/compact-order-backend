package com.compact.test.order.service.impl;

import com.compact.test.order.entity.Product;
import com.compact.test.order.repository.ProductRepository;
import com.compact.test.order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public boolean isExist(Long id) {
        int i = productRepository.count(id);
        return i>0;
    }

    @Override
    public void save(String productName) {
        Product product = new Product();
        product.setProductName(productName);
        productRepository.save(product);
    }


}
