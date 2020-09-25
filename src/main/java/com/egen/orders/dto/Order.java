package com.egen.orders.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order implements Serializable {
    private String orderId;
    private String createdDate;
    private String modifiedDate;
    private String promisedDate;
    private String deliveredDate;
    private String orderType;
    private String deliveryType;
    private String orderStatus;
    private BigDecimal orderTotal;
    private BigDecimal orderTax;
    private BigDecimal orderShippingCharge;
    private CustomerInfo customerInfo;
    private List<OrderItems> orderItems;
    private List<PaymentInfo> paymentInfo;
    private Address addressDetails;
    
}