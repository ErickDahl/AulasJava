package org.serratec.pedido.controllers;

import org.serratec.pedido.exceptions.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsController {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<String> tratarNotFound(NotFoundException exception){
		return ResponseEntity
				.notFound()
				.header("ID", exception.getId().toString())
				.header("ERROR-MSG", exception.getMsg())
				.build();
	}
}
