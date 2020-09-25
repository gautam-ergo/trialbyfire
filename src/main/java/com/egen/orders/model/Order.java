package com.egen.orders.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "orders")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    UUID orderId;
    Date createdDate;
    Date modifiedDate;
    Date promisedDate;
    Date deliveredDate;
    String orderType;
    String deliveryType;
    String orderStatus;
    BigDecimal orderTotal;
    BigDecimal orderTax;
    BigDecimal orderShippingCharge;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cust_id")
    private CustomerInfo customerInfo;

    @OneToMany(fetch = FetchType.LAZY,cascade= CascadeType.ALL)
    @JoinColumn (name = "order_id")
    private List<OrderItems> orderItems;

    @OneToMany(fetch = FetchType.LAZY,cascade= CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<PaymentInfo> paymentInfo;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "add_key", referencedColumnName = "add_key")
    private AddressDetails addressDetails;
}

