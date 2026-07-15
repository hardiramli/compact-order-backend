package com.compact.test.order.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "sales_order")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String productName;

    @Column
    private String customer;

    @Column
    private Integer amount;

    @Column
    private Date transactionDate;

}
