package com.gokcedx.mindbehind.testcase.exception;

/**
 * @author Gökçe DOĞANAY
 * @since 1.0.0
 */
public class FileWritingException extends RuntimeException {
    public FileWritingException() {
        super("File Writing Error");
    }
}
