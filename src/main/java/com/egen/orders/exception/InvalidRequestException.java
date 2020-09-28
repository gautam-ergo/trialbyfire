package com.egen.orders.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvalidRequestException extends Exception {
    private String error;
    private String field;
}
