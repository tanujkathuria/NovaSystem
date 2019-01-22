package com.svam.exceptions;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


/**
 * 
 * @author tanujkathuria
 *
 */
@ControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<ExceptionMessage> handleUserNotFoundException(UserNotFoundException e, WebRequest request)
	{
		ExceptionMessage exceptionResponse =new ExceptionMessage(e.getMessage(), "Please check your request");
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(EntityNotFoundException.class)
	protected ResponseEntity<Object> handleEntityNotFound(
			EntityNotFoundException ex) {
		ExceptionMessage exceptionResponse =new ExceptionMessage(ex.getMessage(), "Please check your request");
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionMessage> handleAllExceptions(Exception e){
		ExceptionMessage exceptionResponse =new ExceptionMessage(e.getMessage(), "Please check your request");
		return new ResponseEntity<ExceptionMessage>(exceptionResponse, HttpStatus.NOT_FOUND);
	}


}
