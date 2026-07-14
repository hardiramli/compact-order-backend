package com.compact.test.order.service.dto;

import lombok.Data;

@Data
public class OrderReq {

    private String productName;

    private String customer;

    private Integer amount;

    private Long totalOrder;
}