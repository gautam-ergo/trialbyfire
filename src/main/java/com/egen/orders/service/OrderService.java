package com.egen.orders.service;

import com.egen.orders.dao.IOrderDAO;
import com.egen.orders.dto.Address;
import com.egen.orders.dto.Item;
import com.egen.orders.dto.Order;
import com.egen.orders.dto.OrderItems;
import com.egen.orders.model.AddressDetails;
import com.egen.orders.model.OrderItemId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class OrderService {
    @Autowired
    IOrderDAO orderDAO;

    /**
     * @param id
     * @return response
     */
    public Order orders(String id){
        Optional<com.egen.orders.model.Order> order = orderDAO.findById(UUID.fromString(id));
        Order response = null;
        com.egen.orders.model.Order o = null;
        if (order.isPresent()){
             o = order.get();
            List<OrderItems> orderItems = new ArrayList<>();
             o.getOrderItems().forEach(oi -> {
                 orderItems.add(OrderItems.builder().item(Item.builder()
                         .itemId(oi.getItem().getItemId())
                         .itemCatg(oi.getItem().getItemCatg())
                         .descr(oi.getItem().getDescr())
                         .build())
                         .orderId(oi.getOrderId().toString())
                         .qty(oi.getQty())
                         .status(oi.getStatus())
                         .total(oi.getTotal())
                         .orderItemNo(oi.getOrderItemNo())
                         .build());
             });
             response = Order.builder()
                     .createdDate(o.getCreatedDate().toString())
                     .deliveredDate(o.getDeliveredDate().toString())
                     .deliveryType(o.getDeliveryType())
                     .modifiedDate(o.getModifiedDate().toString())
                     .orderId(o.getOrderId().toString())
                     .orderShippingCharge(o.getOrderShippingCharge())
                     .orderTax(o.getOrderTax())
                     .orderTotal(o.getOrderTotal())
                     .orderType(o.getOrderType())
                     .promisedDate(o.getPromisedDate().toString())
                     .addressDetails(Address.builder()
                             .addKey(o.getAddressDetails().getAddKey())
                             .addrLines(o.getAddressDetails().getAddrLines())
                             .addType(o.getAddressDetails().getAddType())
                             .city(o.getAddressDetails().getCity())
                             .zip(o.getAddressDetails().getZip())
                             .states(o.getAddressDetails().getStates()).build())
                     .orderStatus(o.getOrderStatus())
                     .orderItems(orderItems)
                     .build();

        }
        return response;
    }

    public Order orders(String id, Order order){
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf1.parse(order.getCreatedDate());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        java.sql.Date ordDate = new java.sql.Date(date.getTime());
        List<com.egen.orders.model.OrderItems> orderItemsDto = new ArrayList<>();
        order.getOrderItems().forEach(oi -> {
            orderItemsDto.add(com.egen.orders.model.OrderItems.builder().item(com.egen.orders.model.Item.builder()
                    .itemId(oi.getItem().getItemId())
                    .itemCatg(oi.getItem().getItemCatg())
                    .descr(oi.getItem().getDescr())
                    .build())
                    .orderId(UUID.fromString(oi.getOrderId()))
                    .orderItemNo(oi.getOrderItemNo())
                    .qty(oi.getQty())
                    .status(oi.getStatus())
                    .total(oi.getTotal())
                    .build());
        });

        com.egen.orders.model.Order orderModel = com.egen.orders.model.Order.builder()
                .orderId(UUID.fromString(id))
                .createdDate(ordDate)
                .promisedDate(ordDate)
                .deliveredDate(ordDate)
                .modifiedDate(ordDate)
                .orderTax(order.getOrderTax())
                .orderShippingCharge(order.getOrderShippingCharge())
                .orderTotal(order.getOrderTotal())
                .orderType(order.getOrderType())
                .orderStatus(order.getOrderStatus())
                .deliveryType(order.getDeliveryType())
                .orderItems(orderItemsDto)
                .addressDetails(AddressDetails.builder()
                        .addKey(order.getAddressDetails().getAddKey())
                        .addrLines(order.getAddressDetails().getAddrLines())
                        .addType(order.getAddressDetails().getAddType())
                        .city(order.getAddressDetails().getCity())
                        .zip(order.getAddressDetails().getZip())
                        .states(order.getAddressDetails().getStates()).build())
                .build();
        orderDAO.save(orderModel);
        return Order.builder().orderId(id).build();
    }
}
