package com.gaaji.CrudGaaji.controller;/*  gaajiCode
    99
    19/09/2024
    */

import com.gaaji.CrudGaaji.entity.Customer;
import com.gaaji.CrudGaaji.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;




    @PostMapping
    public Customer saveEmployee(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping
    public List<Customer> getAllEmployee(){
        return customerService.getAllCustomer();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getEmployeeById(@PathVariable("id") int id){
        return customerService.getCustomerById(id);
    }

    @PutMapping("/{id}")
    public Customer updateEmployee(@PathVariable int id, @RequestBody Customer customer){
        return customerService.updateCustomer(id,customer);
    }

    
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id){
       customerService.deleteCustomer(id);
    }

}
