package com.egen.orders.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemId implements Serializable {

    @Column(name = "order_id")
    private UUID orderId;
    @Column(name = "order_item_no")
    private Long orderItemNo;

    @Override
    public boolean equals(Object other) {
        OrderItemId otherOrderItemId = (OrderItemId)other;
        if(other == null || otherOrderItemId.orderItemNo == null || otherOrderItemId.orderId == null) {
            return false;
        }
        return this.orderId.equals(otherOrderItemId.orderId) && this.orderItemNo.equals(otherOrderItemId.orderItemNo);
    }

    @Override
    public int hashCode() {
       return this.orderId.hashCode()*this.orderItemNo.hashCode();
    }
}
