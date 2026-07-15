package com.compact.test.order.repository;

import com.compact.test.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value= """
            
        SELECT customer,
        COUNT(*) total_orders,
        SUM(amount) total_sales,
        FROM orders
        GROUP BY customer
        HAVING SUM(amount) > 100
        ORDER BY total_sales DESC
            
            """,nativeQuery=true)
    List<Object[]> getUserReport();

}
