package com.ms.cards.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author techguyash
 * @Date 10/5/2023
 * @Time 12:16 PM
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CardAlreadyExistsException extends RuntimeException {

    public CardAlreadyExistsException(String message){
        super(message);
    }

}