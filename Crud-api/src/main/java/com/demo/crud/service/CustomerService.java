package com.demo.crud.service;

import com.demo.crud.entity.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer getCustomerById(Long id);
	public void deleteCustomer(Long id);
	
}
