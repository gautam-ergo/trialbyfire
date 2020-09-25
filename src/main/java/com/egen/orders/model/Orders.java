//package com.egen.orders.model;
//
//import lombok.Data;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.io.Serializable;
//import java.sql.Date;
//
//@Entity
//@Data
//@Table(name = "orders")
//public class Orders implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Column(name = "created_date")
//    private Date createdDate;
//
//    @Column(name = "modified_date")
//    private Date modifiedDate;
//
//    @Column(name = "promised_date")
//    private Date promisedDate;
//
//    @Column(name = "delivered_date")
//    private Date deliveredDate;
//
//    @Column(name = "order_total")
//    private Double orderTotal;
//
//    @Column(name = "order_tax")
//    private Double orderTax;
//
//    @Column(name = "order_shipping_charge")
//    private Double orderShippingCharge;
//
//    @Column(name = "cust_id")
//    private Long custId;
//
//    @Column(name = "add_key")
//    private Long addKey;
//
//    @Id
//    @Column(name = "order_id", nullable = false)
//    private String orderId;
//
//    @Column(name = "order_type")
//    private String orderType;
//
//    @Column(name = "delivery_type")
//    private String deliveryType;
//
//}
