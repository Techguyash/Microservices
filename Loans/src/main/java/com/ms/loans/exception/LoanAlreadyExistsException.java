package com.ms.loans.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author techguyash
 * @Date 10/5/2023
 * @Time 12:40 PM
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class LoanAlreadyExistsException extends RuntimeException {

    public LoanAlreadyExistsException(String message){
        super(message);
    }

}

