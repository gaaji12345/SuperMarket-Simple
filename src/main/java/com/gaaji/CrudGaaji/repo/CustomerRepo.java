package com.gaaji.CrudGaaji.repo;/*  gaajiCode
    99
    19/09/2024
    */

import com.gaaji.CrudGaaji.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
