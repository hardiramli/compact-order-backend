package com.compact.test.order.repository;

import com.compact.test.order.entity.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long>{

    @Query(value= """
            
        SELECT customer,
        COUNT(*) total_orders,
        SUM(amount) total_sales,
        AVG(amount) avg_order
        FROM orders
        WHERE order_date >= :date
        GROUP BY customer
        HAVING SUM(amount) > 1000
        ORDER BY total_sales DESC
            
            
            """,nativeQuery=true)
    List<Object[]> getUserReport();

}
