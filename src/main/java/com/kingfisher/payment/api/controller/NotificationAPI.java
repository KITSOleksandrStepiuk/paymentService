package com.kingfisher.payment.api.controller;

import com.kingfisher.payment.api.optile.error.model.ErrorResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.joda.time.DateTime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notification")
public class NotificationAPI {

    @ApiOperation(value = "Accept Optile notification", response = String.class)
    @ApiResponses({
            @ApiResponse(code =  404, message ="Not found", response = ErrorResponse.class),
            @ApiResponse(code =  400, message ="Invalid input", response = ErrorResponse.class),
            @ApiResponse(code =  200, message ="Notification accepted"),
            @ApiResponse(code =  503, message ="Server Internal Error", response = ErrorResponse.class)
    })
    @GetMapping()
    public ResponseEntity getOptileNotification(@RequestParam String transactionId,
                                                @RequestParam String longId,
                                                @RequestParam String shortId,
                                                @RequestParam String entity,
                                                @RequestParam String statusCode,
                                                @RequestParam String reasonCode,
                                                @RequestParam String interactionCode,
                                                @RequestParam String interactionReason,
                                                @RequestParam String resultCode,
                                                @RequestParam String resultInfo,
                                                @RequestParam String notificationId,
                                                @RequestParam DateTime timestamp,
                                                @RequestParam String previousStatusCode,
                                                @RequestParam String previousReasonCode,
                                                @RequestParam(required = false) String returnCodeName,
                                                @RequestParam(required = false) String returnCodeSource,
                                                @RequestParam(required = false) String pspCode,
                                                @RequestParam(required = false) String institutionCode,
                                                @RequestParam(required = false) String customerRegistrationId,
                                                @RequestParam(required = false) String customerRegistrationPassword,
                                                @RequestParam(required = false) String hasRecurringAccount,
                                                @RequestParam(required = false) String network,
                                                @RequestParam(required = false) Double amount,
                                                @RequestParam(required = false) String currency,
                                                @RequestParam(required = false) String reference,
                                                @RequestParam(required = false) DateTime retryAfter,
                                                @RequestParam(required = false) DateTime autoRetryAfter,
                                                @RequestParam(required = false) Integer rejectionCount) {
        //TODO implement notification handling
        return ResponseEntity.ok().build();
    }

}

