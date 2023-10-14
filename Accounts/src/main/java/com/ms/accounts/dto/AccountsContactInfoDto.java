package com.ms.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @author techguyash
 * @Date 10/6/2023
 * @Time 10:04 PM
 */
@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String, String> contactDetails,
                                     List<String> onCallSupport) {

}