package com.ms.accounts.service;

import com.ms.accounts.dto.CustomerDetailsDto;

/**
 * @author techguyash
 * @Date 10/17/2023
 * @Time 12:00 PM
 */
public interface ICustomersService {
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
