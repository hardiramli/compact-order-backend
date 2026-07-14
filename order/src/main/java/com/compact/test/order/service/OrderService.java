package com.compact.test.order.service;

import com.compact.test.order.entity.Order;

import java.util.List;

public interface OrderService {

    void save(OrderReq orderReq);

    List<Order> getAllOrder();

    List<Object[]> getUserReport();



}
