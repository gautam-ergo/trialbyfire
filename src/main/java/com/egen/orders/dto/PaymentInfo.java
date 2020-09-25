package com.egen.orders.dto;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;
import java.sql.Date;

@Builder
@Data
public class PaymentInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String orderId;
    private Long payLineId;
    private Long addKey;
    private String paymentMthd;
    private Double amount;
    private Date paymentDate;

}
