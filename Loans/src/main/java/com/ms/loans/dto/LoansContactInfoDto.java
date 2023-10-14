package com.ms.loans.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @author techguyash
 * @Date 10/6/2023
 * @Time 10:24 PM
 */
@ConfigurationProperties(prefix = "loans")
@Getter
@Setter
public class LoansContactInfoDto {
    private String message;
    private  Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
