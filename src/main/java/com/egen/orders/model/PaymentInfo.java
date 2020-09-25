package com.egen.orders.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payment_info")
public class PaymentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "order_id")
    private UUID orderId;

    @Id
    @Column(name = "pay_line_id", nullable = false)
    private Long payLineId;

    @Column(name = "add_key")
    private Long addKey;

    @Column(name = "payment_mthd")
    private String paymentMthd;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "payment_date")
    private Date paymentDate;

}
