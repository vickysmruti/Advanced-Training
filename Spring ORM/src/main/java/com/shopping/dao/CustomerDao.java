package com.shopping.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.shopping.model.Customer;

@Repository

public interface CustomerDao extends CrudRepository<Customer, Long>{

	Customer findUserByusername(String username);
	
	Customer findCustomerByUsernameAndPassword(String username,String password);
	
}
