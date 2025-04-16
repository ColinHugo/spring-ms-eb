package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.CardsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient( name = "cards", fallback = CardsFallback.class)
public interface CardsFeignClient {

    @GetMapping( value = "/api/fetch", consumes = APPLICATION_JSON_VALUE )
    ResponseEntity< CardsDto > fetchCardDetails(
            @RequestHeader( "eazybank-correlation-id" ) String correlationId,
            @RequestParam String mobileNumber );

}