package com.gokcedx.mindbehind.testcase.exception;

import com.gokcedx.mindbehind.testcase.model.ExceptionResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Gökçe DOĞANAY
 * @since 1.0.0
 */
@ControllerAdvice
public class CommentsExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionResponseDto> commentsNotFound(Exception e) {
        ExceptionResponseDto responseDto = new ExceptionResponseDto();
        responseDto.setErrorCode(404);
        responseDto.setErrorMessage(e.getMessage());
        return new ResponseEntity<>(responseDto, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FileWritingException.class)
    public ResponseEntity<ExceptionResponseDto> fileWritingError(Exception e) {
        ExceptionResponseDto responseDto = new ExceptionResponseDto();
        responseDto.setErrorCode(417);
        responseDto.setErrorMessage(e.getMessage());
        return new ResponseEntity<>(responseDto, HttpStatus.EXPECTATION_FAILED);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionResponseDto> runtimeError(Exception e) {
        ExceptionResponseDto responseDto = new ExceptionResponseDto();
        responseDto.setErrorCode(400);
        responseDto.setErrorMessage(e.getMessage());
        return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponseDto> serverError(Exception e) {
        ExceptionResponseDto responseDto = new ExceptionResponseDto();
        responseDto.setErrorCode(500);
        responseDto.setErrorMessage(e.getMessage());
        return new ResponseEntity<>(responseDto, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
