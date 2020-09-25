package com.egen.orders.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class OrderItems implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderId;
    private Long orderItemNo;
    private Integer qty;
    private Double total;
    private String status;
    private Item item;

}
