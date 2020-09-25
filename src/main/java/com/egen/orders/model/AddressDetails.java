package com.egen.orders.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "address_details")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "add_key", nullable = false)
    private Integer addKey;

    @Column(name = "addr_lines")
    private String addrLines;

    @Column(name = "add_type")
    private String addType;

    @Column(name = "zip")
    private String zip;

    @Column(name = "states")
    private String states;

    @Column(name = "city")
    private String city;

}
