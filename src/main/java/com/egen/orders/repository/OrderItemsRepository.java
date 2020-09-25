package com.egen.orders.repository;

import com.egen.orders.model.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Long>, JpaSpecificationExecutor<OrderItems> {

}