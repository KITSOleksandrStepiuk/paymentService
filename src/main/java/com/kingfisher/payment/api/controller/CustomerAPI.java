package com.kingfisher.payment.api.controller;

import com.kingfisher.payment.api.optile.model.ErrorInfo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerAPI {

    @GetMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Lookup customer in database", response = String.class)
    @ApiResponses({
            @ApiResponse(code =  404, message ="Not found", response = ErrorInfo.class),
            @ApiResponse(code =  400, message ="Invalid input", response = ErrorInfo.class),
            @ApiResponse(code =  200, message ="Customer Id", response = String.class),
            @ApiResponse(code =  503, message ="Server Internal Error", response = ErrorInfo.class)
    })
    public ResponseEntity<String> lookupCustomer(@PathVariable("id") String customerId) {
        return ResponseEntity.ok("Customer being looked up" + customerId);
    }

}