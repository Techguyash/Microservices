package com.ms.cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @author techguyash
 * @Date 10/6/2023
 * @Time 10:16 PM
 */
@ConfigurationProperties(prefix = "cards")
public record CardsContactInfoDto(String message, Map<String, String> contactDetails,
                                  List<String> onCallSupport) {
}