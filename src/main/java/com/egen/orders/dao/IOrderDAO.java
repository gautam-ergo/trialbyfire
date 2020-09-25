package com.egen.orders.dao;

import com.egen.orders.model.Order;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


public interface IOrderDAO {
    Optional<Order> findById(UUID orderId);
    void save (Order order);
}
