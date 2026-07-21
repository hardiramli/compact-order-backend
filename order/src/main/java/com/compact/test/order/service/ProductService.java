package com.compact.test.order.service;

public interface ProductService {

    boolean isExist(Long id);

    void save(String productName);

}
