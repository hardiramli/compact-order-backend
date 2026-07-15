package com.compact.test.order.service.impl;

import com.compact.test.order.entity.Order;
import com.compact.test.order.repository.OrderRepository;
import com.compact.test.order.service.OrderService;
import com.compact.test.order.service.dto.OrderReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void save(OrderReq orderReq) {
        Order order = new Order();
        order.setProductName(orderReq.getProductName());
        order.setCustomer(orderReq.getCustomer());
        order.setAmount(orderReq.getAmount());
        order.setTransactionDate(new Date());
        orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public List<String> getAllCustomer() {
        return orderRepository.findAll().stream().map(Order::getCustomer).sorted().toList();
    }


    @Override
    public List<Object[]> getUserReport(){
        return orderRepository.getUserReport();
    }
}
