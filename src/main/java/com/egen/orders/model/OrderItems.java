package com.egen.orders.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_items" , uniqueConstraints = @UniqueConstraint(columnNames = {
        "order_id",
        "order_item_no"
}))
@Data
@IdClass(OrderItemId.class)
public class OrderItems implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "order_id")
    private UUID orderId;
    @Id
    @Column(name = "order_item_no")
    private Long orderItemNo;

    @Column(name = "qty")
    private Integer qty;

    @Column(name = "total")
    private Double total;

    @Column(name = "status")
    private String status;

    @ManyToOne(fetch = FetchType.LAZY,cascade= CascadeType.ALL)
    @JoinColumn( name = "item_id",referencedColumnName = "item_id")
    private Item item;

}
