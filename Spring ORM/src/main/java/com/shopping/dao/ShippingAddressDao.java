package com.shopping.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.model.ShippingAddress;

@Repository

public interface ShippingAddressDao extends CrudRepository<ShippingAddress, Long>{

}
