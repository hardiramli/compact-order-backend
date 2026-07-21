package com.compact.test.order.repository;

import com.compact.test.order.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value= """
            
        SELECT COUNT(*) product,
        FROM sales_order
        WHERE productName = :i
            """,nativeQuery=true)
    int count(Long id);
}
