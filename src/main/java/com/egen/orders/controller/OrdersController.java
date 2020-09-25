package com.egen.orders.controller;

import com.egen.orders.dto.Order;
import com.egen.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("egen/v1")
@RestController
public class OrdersController {

    @Autowired
    OrderService orderService;

    @GetMapping(path="/orders/{id}",produces="application/json")
    public Order orders(@PathVariable("id") String id){
        return orderService.orders(id);
    }


    @PutMapping (path="/orders/{id}", produces="application/json", consumes = "application/json")
    public Order orders(@PathVariable("id") String id, @RequestBody Order order){
        return orderService.orders(id, order);
    }
}