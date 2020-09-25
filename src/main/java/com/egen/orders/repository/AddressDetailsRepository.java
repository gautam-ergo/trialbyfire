package com.egen.orders.repository;

import com.egen.orders.model.AddressDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AddressDetailsRepository extends JpaRepository<AddressDetails, Integer>, JpaSpecificationExecutor<AddressDetails> {

}