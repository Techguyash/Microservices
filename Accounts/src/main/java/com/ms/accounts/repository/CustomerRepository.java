package com.ms.accounts.repository;

import com.ms.accounts.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author techguyash
 * @Date 10/5/2023
 * @Time 8:34 AM
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
