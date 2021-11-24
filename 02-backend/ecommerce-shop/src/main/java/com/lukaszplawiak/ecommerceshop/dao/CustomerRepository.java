package com.lukaszplawiak.ecommerceshop.dao;

import com.lukaszplawiak.ecommerceshop.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);
}
