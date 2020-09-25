package com.egen.orders.repository;

import com.egen.orders.model.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, Long>, JpaSpecificationExecutor<PaymentInfo> {

}