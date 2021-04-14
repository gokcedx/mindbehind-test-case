package com.gokcedx.mindbehind.testcase.exception;

/**
 * @author Gökçe DOĞANAY
 * @since 1.0.0
 */
public class NotFoundException extends RuntimeException{
    public NotFoundException() {
        super("Comments Not Found");
    }
}
