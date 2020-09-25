package com.egen.orders.dao;

import com.egen.orders.model.Order;
import com.egen.orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class OrderDAOImpl implements IOrderDAO {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Optional<Order> findById(UUID orderId) {
        return orderRepository.findById(orderId);
    }

    @Override
    public void save(Order order) {
         orderRepository.save(order);
    }
}
