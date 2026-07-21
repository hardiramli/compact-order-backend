package com.compact.test.order.service.dto;

import lombok.Data;

@Data
public class OrderReq {

    private Long productId;

    private String customer;

    private Integer amount;

}