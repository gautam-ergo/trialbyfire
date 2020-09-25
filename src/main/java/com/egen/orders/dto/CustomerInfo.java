package com.egen.orders.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class CustomerInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer custId;
    private String name;
    private String email;

}
