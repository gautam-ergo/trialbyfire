package com.egen.orders.repository;

import com.egen.orders.model.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Integer>, JpaSpecificationExecutor<CustomerInfo> {

}