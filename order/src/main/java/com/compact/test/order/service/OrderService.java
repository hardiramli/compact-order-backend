package com.compact.test.order.service;

import com.compact.test.order.entity.Order;

import java.util.List;

public interface OrderService {

    void save(Order order);

    List<Order> getAllOrder();

    List<Object[]> getUserReport();



}
