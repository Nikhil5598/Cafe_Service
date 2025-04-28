package com.cafe.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorHandling> handleResourceNotFoundException(ResourceNotFoundException ex) {
		ErrorHandling er = new ErrorHandling(HttpStatus.NOT_FOUND.value(), ex.getMessage());
		return new ResponseEntity<ErrorHandling>(er, HttpStatus.NOT_FOUND);
		
	}
}