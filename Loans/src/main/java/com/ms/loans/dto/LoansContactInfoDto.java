package com.ms.loans.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @author techguyash
 * @Date 10/6/2023
 * @Time 10:24 PM
 */
@ConfigurationProperties(prefix = "loans")
public record LoansContactInfoDto(String message, Map<String, String> contactDetails,
                                  List<String> onCallSupport) {
}
