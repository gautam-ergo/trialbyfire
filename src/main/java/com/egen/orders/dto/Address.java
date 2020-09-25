package com.egen.orders.dto;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Builder
@Data
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer addKey;
    private String addrLines;
    private String addType;
    private String zip;
    private String states;
    private String city;

}
