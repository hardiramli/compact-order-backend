package com.compact.test.order.controller;

import com.compact.test.order.entity.Order;
import com.compact.test.order.service.OrderService;
import com.compact.test.order.service.ProductService;
import com.compact.test.order.service.dto.OrderReq;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @PostMapping("/submit")
    public ResponseEntity<?> saveOrder(@RequestBody OrderReq req){
        log.info("Register order "+ req.getCustomer() +" "+ req.getProductId());
        if(productService.isExist(req.getProductId())) {
            orderService.save(req);
        } else {
            log.error("Request productname not registered");
            throw new IllegalArgumentException("request product name not registered");
        }
        return new ResponseEntity<>(req, HttpStatus.OK);
    }

    @GetMapping("/reports")
    public ResponseEntity<?> showOrderSummary(){
        log.info("Show order summary");
        List<Object[]> userReport = orderService.getUserReport();
        return new ResponseEntity<>(userReport, HttpStatus.OK);
    }

    @GetMapping("/cust-list")
    public ResponseEntity<?> showCustomers(){
        log.info("Show customer list");
        List<String> userReport = orderService.getAllCustomer();
        return new ResponseEntity<>(userReport, HttpStatus.OK);
    }

    @GetMapping("/show-all")
    public ResponseEntity<?> showOrderAll(){
        log.info("Show order table entry");
        List<Order> userReport = orderService.getAllOrder();
        return new ResponseEntity<>(userReport, HttpStatus.OK);
    }

}
