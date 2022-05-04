package com.shopping.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.model.BillingAddress;

@Repository

public interface BillingAddressDao extends CrudRepository<BillingAddress, Long>{

	 
}
