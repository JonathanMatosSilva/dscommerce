package com.jonathan.dscommerce.repositories;

import com.jonathan.dscommerce.entities.OrderItem;
import com.jonathan.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
