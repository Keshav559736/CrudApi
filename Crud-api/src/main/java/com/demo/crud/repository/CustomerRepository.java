package com.demo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.crud.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
