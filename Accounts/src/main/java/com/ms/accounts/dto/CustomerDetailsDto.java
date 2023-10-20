package com.ms.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author techguyash
 * @Date 10/17/2023
 * @Time 11:41 AM
 */
@Data
@Schema(name = "customerdetails", description = "used for customer details d")
public class CustomerDetailsDto {

    private String name;
    private String email;
    private String mobileNumber;
    private AccountsDto accountsDto;
    private LoansDto loansDto;
    private CardsDto cardsDto;
}
