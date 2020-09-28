package com.egen.orders.exception;

import org.glassfish.jersey.internal.Errors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value=OrderNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity exception(OrderNotFoundException orderNotFoundException){
        return new ResponseEntity<Object>("{\"errorMessage\": \"Order Not Found\"}",new HttpHeaders(), HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(value=InvalidRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity exception(InvalidRequestException invalidRequestException){
        return new ResponseEntity<Object>("{\"errorMessage\": \""+invalidRequestException.getError()+"\",\"field\":\""+invalidRequestException.getField()+"\"}",new HttpHeaders(), HttpStatus.BAD_REQUEST);

    }


}
