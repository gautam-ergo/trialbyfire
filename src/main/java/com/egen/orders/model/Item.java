package com.egen.orders.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "item")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "item_id", nullable = false)
    private Integer itemId;

    @Column(name = "descr")
    private String descr;

    @Column(name = "item_catg")
    private String itemCatg;
//
//    @OneToMany
//    private List<OrderItems> orderItems;

}
