package com.ms.accounts.dto;

import lombok.Data;

/**
 * @author techguyash
 * @Date 10/5/2023
 * @Time 8:42 AM
 */
@Data
public class CustomerDto {
    private String name;
    private String email;
    private String mobileNumber;
    private AccountsDto accountsDto;

}
