package com.egen.orders.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer itemId;
    private String descr;
    private String itemCatg;
}
