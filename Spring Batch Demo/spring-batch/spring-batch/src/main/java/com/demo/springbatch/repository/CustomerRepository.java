package com.demo.springbatch.repository;

import com.demo.springbatch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
