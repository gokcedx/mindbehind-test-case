package com.gokcedx.mindbehind.testcase.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Gökçe DOĞANAY
 * @since 1.0.0
 */
@Getter
@Setter
public class ExceptionResponseDto {
    private int errorCode;
    private String errorMessage;
}
