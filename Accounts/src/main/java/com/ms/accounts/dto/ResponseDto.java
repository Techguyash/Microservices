package com.ms.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author techguyash
 * @Date 10/5/2023
 * @Time 8:44 AM
 */
@Data @AllArgsConstructor
public class ResponseDto {

    private String statusCode;
    private String statusMsg;
}
