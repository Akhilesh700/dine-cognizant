package com.Learnings.dine_cognizant.service;

import com.Learnings.dine_cognizant.model.Customer;
import com.Learnings.dine_cognizant.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Create / Save Customer
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Read All Customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Read Customer by ID
    public Optional<Customer> getCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    // Update Customer
    public Customer updateCustomer(Customer customer) {
        // You might want to add checks here, e.g., if the customer exists
        return customerRepository.save(customer);
    }

    // Delete Customer
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }
}