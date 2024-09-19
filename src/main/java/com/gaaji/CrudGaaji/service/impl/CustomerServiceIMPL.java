package com.gaaji.CrudGaaji.service.impl;/*  gaajiCode
    99
    19/09/2024
    */

import com.gaaji.CrudGaaji.entity.Customer;
import com.gaaji.CrudGaaji.repo.CustomerRepo;
import com.gaaji.CrudGaaji.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    CustomerRepo repo;

    @Override
    public Customer saveCustomer(Customer employee) {
        return repo.save(employee);
    }

    @Override
    public Optional<Customer> getCustomerById(int id) {
        return repo.findById(id);
    }

    @Override
    public List<Customer> getAllEmployee() {
        return repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public Customer updateCustomer(int id, Customer employee) {
        Customer customerToUpdate = repo.findById(id).orElseThrow();
        customerToUpdate.setFirstName(employee.getFirstName());
        customerToUpdate.setLastName(employee.getLastName());
        customerToUpdate.setEmail(employee.getEmail());
        return repo.save(customerToUpdate);
    }

    @Override
    public void deleteCustomer(int id) {
        repo.deleteById(id);
    }
}
