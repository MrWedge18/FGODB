package mrwedge.fgodb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import mrwedge.fgodb.exception.ServantNotFoundException;

@ControllerAdvice
public class ServantNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(ServantNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String servantNotFoundHandler(ServantNotFoundException ex) {
		return ex.getMessage();
	}
}
