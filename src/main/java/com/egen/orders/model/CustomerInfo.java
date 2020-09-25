package com.egen.orders.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "customer_info")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cust_id", nullable = false)
    private Integer custId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

}
