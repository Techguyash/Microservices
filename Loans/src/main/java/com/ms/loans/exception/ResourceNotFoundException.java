package com.ms.loans.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author techguyash
 * @Date 10/5/2023
 * @Time 12:41 PM
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue){
        super(String.format("%s not found with the given input data %s : '%s'", resourceName, fieldName, fieldValue));
    }
}
