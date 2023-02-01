package com.demo.crud.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.crud.entity.Customer;
import com.demo.crud.repository.CustomerRepository;
import com.demo.crud.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer existingCustomer = customerRepository.findById(customer.getId()).orElse(null);
		  if (existingCustomer != null) {
		    existingCustomer.setName(customer.getName());
		    existingCustomer.setId(customer.getId());
		    existingCustomer.setProduct(customer.getProduct());
		  }
		  return customerRepository.save(existingCustomer);
	}

	@Override
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteCustomer(Long id) {
		 customerRepository.deleteById(id);
	}

}
