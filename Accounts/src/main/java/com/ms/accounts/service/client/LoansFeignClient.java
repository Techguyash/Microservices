package com.ms.accounts.service.client;

import com.ms.accounts.dto.CardsDto;
import com.ms.accounts.dto.LoansDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author techguyash
 * @Date 10/17/2023
 * @Time 9:42 AM
 */
@FeignClient("loans")
public interface LoansFeignClient {

    @GetMapping(value = "/api/fetch",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoansDto> fetchLoanDetails(String mobileNumber);
}