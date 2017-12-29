package com.kingfisher.payment.api.error;

import com.kingfisher.payment.api.optile.model.ErrorInfo;
import com.kingfisher.payment.api.optile.model.Interaction;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Order(value = 2)
@ControllerAdvice
public class GeneralExceptionHandler {

    @ExceptionHandler({Exception.class})
    public ResponseEntity handle(Exception e){
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        ErrorInfo info = new ErrorInfo();

        Interaction interaction = new Interaction();
        interaction.setCode(Interaction.CodeEnum.ABORT);
        interaction.setReason(Interaction.ReasonEnum.BLOCKED);

        info.setInteraction(interaction);
        info.setResultInfo(status.getReasonPhrase());
        info.setResultInfo(status.getReasonPhrase());

        return ResponseEntity.status(status.value()).body(info);
    }
}
