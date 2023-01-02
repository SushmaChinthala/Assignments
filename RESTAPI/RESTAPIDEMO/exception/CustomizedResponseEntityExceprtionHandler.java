package com.example.RESTAPI.RESTAPIDEMO.exception;

import java.time.LocalDate;
import com.example.RESTAPI.RESTAPIDEMO.user.UserNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class CustomizedResponseEntityExceprtionHandler extends ResponseEntityExceptionHandler 
{
 @ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetails> handleAllException1(Exception ex,WebRequest request) throws Exception
	{
		ErrorDetails errorDetails=new ErrorDetails(LocalDate.now(),
				ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	  @ExceptionHandler(UserNotFoundException.class) public final
	  ResponseEntity<Object> UserNotFoundException(Exception ex,WebRequest request)
	  throws Exception { ErrorDetails errorDetails=new
	  ErrorDetails(LocalDate.now(), ex.getMessage(),
	  request.getDescription(false)); return new
	  ResponseEntity(errorDetails,HttpStatus.NOT_FOUND); }
	 
}
