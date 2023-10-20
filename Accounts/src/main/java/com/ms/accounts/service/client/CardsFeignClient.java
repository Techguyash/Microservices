package com.ms.accounts.service.client;

import com.ms.accounts.dto.CardsDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.constraints.Pattern;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author techguyash
 * @Date 10/17/2023
 * @Time 9:35 AM
 */
@FeignClient("cards")
public interface CardsFeignClient {

    @GetMapping(value = "/api/fetch",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CardsDto> fetchCardDetails(String mobileNumber);
}
