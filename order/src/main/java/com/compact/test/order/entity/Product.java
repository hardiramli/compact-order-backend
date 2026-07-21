package com.compact.test.order.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "sales_product")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String productName;
}
