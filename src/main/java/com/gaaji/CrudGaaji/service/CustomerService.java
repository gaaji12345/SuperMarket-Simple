package com.gaaji.CrudGaaji.service;/*  gaajiCode
    99
    19/09/2024
    */

import com.gaaji.CrudGaaji.entity.Customer;
import com.gaaji.CrudGaaji.repo.CustomerRepo;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer saveCustomer(Customer employee);
     Optional<Customer> getCustomerById(int id);
    List<Customer> getAllEmployee();
    Customer updateCustomer(int id, Customer employee);
    void deleteCustomer(int id);
}
