package com.compact.test.order.service.impl;

import com.compact.test.order.entity.Order;
import com.compact.test.order.service.OrderService;

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

        orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public List<Object[]> getUserReport(){
        return orderRepository.getUserReport();
    }
}
